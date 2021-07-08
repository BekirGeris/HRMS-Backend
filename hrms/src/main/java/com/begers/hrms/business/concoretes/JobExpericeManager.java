package com.begers.hrms.business.concoretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.begers.hrms.business.abstacts.JobExperienceService;
import com.begers.hrms.core.utilities.result.DataResult;
import com.begers.hrms.core.utilities.result.Result;
import com.begers.hrms.core.utilities.result.SuccessDataResult;
import com.begers.hrms.core.utilities.result.SuccessResult;
import com.begers.hrms.dataAccess.abstracts.JobExperienceDao;
import com.begers.hrms.entites.concoretes.JobExperience;

@Service
public class JobExpericeManager implements JobExperienceService{
	
	private JobExperienceDao jobExperienceDao;
	
	@Autowired
	public JobExpericeManager(JobExperienceDao jobExperienceDao) {
		super();
		this.jobExperienceDao = jobExperienceDao;
	}

	@Override
	public DataResult<JobExperience> getById(int id) {
		return new SuccessDataResult<JobExperience>(this.jobExperienceDao.getById(id), "Job Experience getirildi.");
	}

	@Override
	public DataResult<List<JobExperience>> getByCv_Id(int cvId) {
		return new SuccessDataResult<List<JobExperience>>(this.jobExperienceDao.getByCv_Id(cvId), "Cv ye ait Job Experience getirildi.");
	}

	@Override
	public Result add(JobExperience jobExperience) {
		this.jobExperienceDao.save(jobExperience);
		return new SuccessResult("Job Experience eklendi.");
	}

	@Override
	public DataResult<List<JobExperience>> getAll() {
		return new SuccessDataResult<List<JobExperience>>(this.jobExperienceDao.findAll(), "Tum Job Experience ler getirildi.");
	}

}
