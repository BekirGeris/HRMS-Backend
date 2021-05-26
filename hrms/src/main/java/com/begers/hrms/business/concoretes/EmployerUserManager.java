package com.begers.hrms.business.concoretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.begers.hrms.business.abstacts.EmployerUserService;
import com.begers.hrms.dataAccess.abstracts.EmployerUserDao;
import com.begers.hrms.entites.concoretes.EmployerUser;

public class EmployerUserManager implements EmployerUserService{

	private EmployerUserDao employerUserDao;

	@Autowired
	public EmployerUserManager(EmployerUserDao employerUserDao) {
		super();
		this.employerUserDao = employerUserDao;
	}

	@Override
	public List<EmployerUser> getAll() {
		return this.employerUserDao.findAll();
	}
	
	
}
