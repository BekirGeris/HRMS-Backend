package com.begers.hrms.business.abstacts;

import java.util.List;

import org.springframework.stereotype.Service;

import com.begers.hrms.core.utilities.result.DataResult;
import com.begers.hrms.core.utilities.result.Result;
import com.begers.hrms.entites.concoretes.JobPositions;

@Service
public interface JobPositionService {
	DataResult<List<JobPositions>> gatAll();
	
	Result add(JobPositions jobPositions);
}
