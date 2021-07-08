package com.begers.hrms.business.abstacts;

import java.util.List;

import org.springframework.stereotype.Service;

import com.begers.hrms.core.utilities.result.DataResult;
import com.begers.hrms.core.utilities.result.Result;
import com.begers.hrms.entites.concoretes.CoverLetter;

@Service
public interface CoverLetterService {

	Result add(CoverLetter coverLetter);
	
	DataResult<List<CoverLetter>> getAll();
	
	DataResult<CoverLetter> getById(int id);

	DataResult<CoverLetter> getByCv_Id(int cvId);
}
