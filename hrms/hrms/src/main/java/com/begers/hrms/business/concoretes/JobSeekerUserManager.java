package com.begers.hrms.business.concoretes;

import java.util.List;

import org.springframework.stereotype.Service;

import com.begers.hrms.business.abstacts.AuthService;
import com.begers.hrms.business.abstacts.CvService;
import com.begers.hrms.business.abstacts.JobSeekerUserService;
import com.begers.hrms.core.utilities.result.DataResult;
import com.begers.hrms.core.utilities.result.ErrorResult;
import com.begers.hrms.core.utilities.result.Result;
import com.begers.hrms.core.utilities.result.SuccessDataResult;
import com.begers.hrms.core.utilities.result.SuccessResult;
import com.begers.hrms.dataAccess.abstracts.JobSeekerUserDao;
import com.begers.hrms.entites.concoretes.Cv;
import com.begers.hrms.entites.concoretes.JobSeekerUser;

@Service
public class JobSeekerUserManager implements JobSeekerUserService{

	private JobSeekerUserDao jobSeekerUserDao;
	private AuthService authService;
	private CvService cvService;

	public JobSeekerUserManager(JobSeekerUserDao jobSeekerUserDao, AuthService authService, CvService cvService) {
		super();
		this.jobSeekerUserDao = jobSeekerUserDao;
		this.authService = authService;
		this.cvService = cvService;
	}

	@Override
	public DataResult<List<JobSeekerUser>> getAll() {
		return new SuccessDataResult<List<JobSeekerUser>>(jobSeekerUserDao.findAll(), "Is arayanlar listelendi");
	}

	@Override
	public Result add(JobSeekerUser jobSeekerUser) {
		
		if (this.authService.checkingCenter(jobSeekerUser.getEmail(), jobSeekerUser.getIdentificationNumber())) {
			
			this.jobSeekerUserDao.save(jobSeekerUser);
			return new SuccessResult("Is arayan ekleme basarili");
			
		}
		return new ErrorResult(authService.getMessage());
	}

	@Override
	public DataResult<JobSeekerUser> getById(int id) {
		return new SuccessDataResult<JobSeekerUser>(this.jobSeekerUserDao.getById(id), "Job seeker getirildi.");
	}

	@Override
	public DataResult<List<Cv>> getJobSeekerCv(int id) {
		JobSeekerUser jobSeekerUser = this.jobSeekerUserDao.getById(id);
		return new SuccessDataResult<List<Cv>>(this.cvService.getByEmail(jobSeekerUser.getEmail()), "Kullanıcı cv leri listelendi.");
	}
	
}
