package com.begers.hrms.business.concoretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.begers.hrms.business.abstacts.CvService;
import com.begers.hrms.core.utilities.result.DataResult;
import com.begers.hrms.core.utilities.result.Result;
import com.begers.hrms.core.utilities.result.SuccessDataResult;
import com.begers.hrms.core.utilities.result.SuccessResult;
import com.begers.hrms.dataAccess.abstracts.CvDao;
import com.begers.hrms.entites.concoretes.Cv;

@Service
public class CvManager implements CvService {

	private CvDao cvDao;

	@Autowired
	public CvManager(CvDao cvDao) {
		super();
		this.cvDao = cvDao;
	}

	@Override
	public DataResult<List<Cv>> findByEmail(String email) {
		return new SuccessDataResult<List<Cv>>(this.cvDao.findByEmail(email), "Cvler getirildi.");
	}

	@Override
	public DataResult<Cv> findByFirstNameAndLastName(String firstName, String lastName) {
		return new SuccessDataResult<Cv>(this.cvDao.findByFirstNameAndLastName(firstName, lastName), "Cv getirildi.");
	}

	@Override
	public DataResult<Cv> getById(int id) {
		return null;
	}

	@Override
	public Result add(Cv cv) {
		this.cvDao.save(cv);
		return new SuccessResult("Cv eklendi.");
	}

	@Override
	public Result delete(int id) {
		this.cvDao.deleteById(id);
		return new SuccessResult("Cv silindi.");
	}

	@Override
	public DataResult<List<Cv>> getAll() {
		return new SuccessDataResult<List<Cv>>(this.cvDao.findAll(), "Tüm cv ler listelendi");
	}

	@Override
	public DataResult<List<Cv>> findAll(int value) {
		Sort sort;
		String message;
		if (value == 1) {
			sort = Sort.by(Sort.Direction.ASC, "listingDate");
			message = "Ilanlar en yeniden en eksiye siralandi";
		}else {
			sort = Sort.by(Sort.Direction.DESC, "listingDate");
			message = "Ilanlar en eskiden en yeniye siralandi";
		}
		return new SuccessDataResult<List<Cv>>(this.cvDao.findAll(sort), message);
	
	}

	@Override
	public List<Cv> getByEmail(String email) {
		return this.cvDao.findByEmail(email);
	}

}
