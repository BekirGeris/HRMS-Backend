package com.begers.hrms.business.abstacts;

import java.util.List;

import org.springframework.stereotype.Service;

import com.begers.hrms.core.utilities.result.DataResult;
import com.begers.hrms.core.utilities.result.Result;
import com.begers.hrms.entites.concoretes.Cv;
import com.begers.hrms.entites.concoretes.JobSeekerUser;

@Service
public interface JobSeekerUserService {
	DataResult<List<JobSeekerUser>> getAll();
	
	Result add(JobSeekerUser jobSeekerUser);
	
	DataResult<JobSeekerUser> getById(int id);
	
	DataResult<List<Cv>> getJobSeekerCv(int id);
}
