package com.begers.hrms.business.abstacts;

import java.util.List;

import org.springframework.stereotype.Service;

import com.begers.hrms.core.utilities.result.DataResult;
import com.begers.hrms.core.utilities.result.Result;
import com.begers.hrms.entites.concoretes.Cv;

@Service
public interface CvService {

	Result add(Cv cv);
	
	Result delete(int id);
	
	DataResult<List<Cv>> getAll();
	
	DataResult<List<Cv>> findAll(int value);
	
	DataResult<List<Cv>> findByEmail(String email);
	
	List<Cv> getByEmail(String email);
	
	DataResult<Cv> findByFirstNameAndLastName(String firstName, String lastName);
	
	DataResult<Cv> getById(int id);
	
}
