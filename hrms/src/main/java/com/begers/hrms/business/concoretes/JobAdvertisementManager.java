package com.begers.hrms.business.concoretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.begers.hrms.business.abstacts.JobAdvertisementService;
import com.begers.hrms.core.utilities.result.DataResult;
import com.begers.hrms.core.utilities.result.ErrorResult;
import com.begers.hrms.core.utilities.result.Result;
import com.begers.hrms.core.utilities.result.SuccessDataResult;
import com.begers.hrms.core.utilities.result.SuccessResult;
import com.begers.hrms.dataAccess.abstracts.JobAdvertisementDao;
import com.begers.hrms.entites.concoretes.JobAdvertisement;

@Service
public class JobAdvertisementManager implements JobAdvertisementService{

	private JobAdvertisementDao jobAdvertisementDao;
	
	@Autowired
	public JobAdvertisementManager(JobAdvertisementDao jobAdvertisementDao) {
		super();
		this.jobAdvertisementDao = jobAdvertisementDao;
	}

	@Override
	public DataResult<List<JobAdvertisement>> getAll() {
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.findAll(), "Ilanlar siralandi");
	}

	@Override
	public Result add(JobAdvertisement jobAdvertisement) {
		this.jobAdvertisementDao.save(jobAdvertisement);
		return new SuccessResult("Ilan eklendi");
	}

	@Override
	public DataResult<List<JobAdvertisement>> getByActiveJobAdvertisement() {
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.getByActive(true), "Aktif ilanlar listelendi");
	}

	@Override
	public DataResult<List<JobAdvertisement>> getAllActiveSortedJodAdvertisement(int value) {
		Sort sort;
		String message;
		if (value == 1) {
			sort = Sort.by(Sort.Direction.ASC, "listingDate");
			message = "Ilanlar en yeniden en eksiye siralandi";
		}else {
			sort = Sort.by(Sort.Direction.DESC, "listingDate");
			message = "Ilanlar en eskiden en yeniye siralandi";
		}
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.getByActive(true, sort), message);
	}

	@Override
	public DataResult<List<JobAdvertisement>> getAllActiveAndEmployerName(String EmployerName) {
		return new SuccessDataResult<List<JobAdvertisement>>
		(this.jobAdvertisementDao.getByActiveAndEmployerUser_CompanyName(true, EmployerName), "Is verene ait aktif ilanlar listelendi.");
	}

	@Override
	public Result changedActivated(int jobAdvertisementId) {
		JobAdvertisement jobAdvertisement = this.jobAdvertisementDao.getById(jobAdvertisementId);
		
		if (jobAdvertisement == null) {
			return new ErrorResult("Bu id'ye sahip bir ilan bulunmamaktadir.");
		}
		
		if (jobAdvertisement.isActive()) {
			jobAdvertisement.setActive(false);
			return new SuccessResult("Ilan kapatildi...");
		}else {
			jobAdvertisement.setActive(true);
			return new SuccessResult("Ilan acildi...");
		}
		
	}

}
