package com.begers.hrms.business.abstacts;

import java.util.List;

import org.springframework.stereotype.Service;

import com.begers.hrms.core.utilities.result.DataResult;
import com.begers.hrms.core.utilities.result.Result;
import com.begers.hrms.entites.concoretes.City;
import com.begers.hrms.entites.concoretes.JobExperience;

@Service
public interface JobExperienceService {

	Result add(JobExperience jobExperience);
	
	DataResult<List<JobExperience>> getAll();
	
	DataResult<JobExperience> getById(int id);
	
	DataResult<List<JobExperience>> getByCv_Id(int cvId);
}
