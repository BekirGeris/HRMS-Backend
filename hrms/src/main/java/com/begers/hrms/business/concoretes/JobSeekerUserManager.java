package com.begers.hrms.business.concoretes;

import java.util.List;

import org.springframework.stereotype.Service;

import com.begers.hrms.business.abstacts.JobSeekerUserService;
import com.begers.hrms.core.utilities.result.DataResult;
import com.begers.hrms.core.utilities.result.Result;
import com.begers.hrms.core.utilities.result.SuccessDataResult;
import com.begers.hrms.core.utilities.result.SuccessResult;
import com.begers.hrms.dataAccess.abstracts.JobSeekerUserDao;
import com.begers.hrms.entites.concoretes.JobSeekerUser;

@Service
public class JobSeekerUserManager implements JobSeekerUserService{

	private JobSeekerUserDao jobSeekerUserDao;

	public JobSeekerUserManager(JobSeekerUserDao jobSeekerUserDao) {
		super();
		this.jobSeekerUserDao = jobSeekerUserDao;
	}

	@Override
	public DataResult<List<JobSeekerUser>> getAll() {
		return new SuccessDataResult<List<JobSeekerUser>>(jobSeekerUserDao.findAll(), "Is arayanlar listelendi");
	}

	@Override
	public Result add(JobSeekerUser jobSeekerUser) {
		this.jobSeekerUserDao.save(jobSeekerUser);
		return new SuccessResult("Is arayan ekleme basarili");
	}
	
	
}
