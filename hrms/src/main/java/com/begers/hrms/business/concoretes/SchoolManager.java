package com.begers.hrms.business.concoretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.begers.hrms.business.abstacts.SchoolService;
import com.begers.hrms.core.utilities.result.DataResult;
import com.begers.hrms.dataAccess.abstracts.SchoolDao;
import com.begers.hrms.entites.concoretes.School;

@Service
public class SchoolManager implements SchoolService{

	private SchoolDao schoolDao;
	
	@Autowired
	public SchoolManager(SchoolDao schoolDao) {
		super();
		this.schoolDao = schoolDao;
	}

	@Override
	public DataResult<School> getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<List<School>> getByCv_Id(int cvId) {
		// TODO Auto-generated method stub
		return null;
	}
}
