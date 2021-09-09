package com.begers.hrms.business.concoretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.begers.hrms.business.abstacts.SchoolService;
import com.begers.hrms.core.utilities.result.DataResult;
import com.begers.hrms.core.utilities.result.Result;
import com.begers.hrms.core.utilities.result.SuccessDataResult;
import com.begers.hrms.core.utilities.result.SuccessResult;
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
		return new SuccessDataResult<School>(this.schoolDao.getById(id), "School bilgisi getirildi.");
	}

	@Override
	public DataResult<List<School>> getByCv_Id(int cvId) {
		return new SuccessDataResult<List<School>>(this.schoolDao.getByCv_Id(cvId), "Cv ye ait schools bilgisi listelendi.");
	}

	@Override
	public Result add(School school) {
		this.schoolDao.save(school);
		return new SuccessResult("School eklendi.");
	}

	@Override
	public DataResult<List<School>> getAll() {
		return new SuccessDataResult<List<School>>(null, null);
	}
}
