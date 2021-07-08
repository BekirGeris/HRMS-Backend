package com.begers.hrms.business.abstacts;

import java.util.List;

import org.springframework.stereotype.Service;

import com.begers.hrms.core.utilities.result.DataResult;
import com.begers.hrms.entites.concoretes.School;

@Service
public interface SchoolService {

	DataResult<School> getById(int id);
	
	DataResult<List<School>> getByCv_Id(int cvId);
}
