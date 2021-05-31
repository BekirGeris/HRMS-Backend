package com.begers.hrms.business.abstacts;

import java.util.List;

import org.springframework.stereotype.Service;

import com.begers.hrms.core.utilities.result.DataResult;
import com.begers.hrms.core.utilities.result.Result;
import com.begers.hrms.entites.concoretes.JobAdvertisement;

@Service
public interface JobAdvertisementService {

	DataResult<List<JobAdvertisement>> getAll();
	
	DataResult<List<JobAdvertisement>> getByActiveJobAdvertisement();
	
	DataResult<List<JobAdvertisement>> getAllActiveSortedJodAdvertisement(int value);
	
	DataResult<List<JobAdvertisement>> getAllActiveAndEmployerName(String employerName);

	Result add(JobAdvertisement jobAdvertisement);
	
}
