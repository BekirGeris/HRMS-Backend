package com.begers.hrms.business.concoretes;

import com.begers.hrms.business.abstacts.EmployerUserService;
import com.begers.hrms.dataAccess.abstracts.EmployerUserDao;

public class EmployerUserManager implements EmployerUserService{

	private EmployerUserDao employerUserDao;

	public EmployerUserManager(EmployerUserDao employerUserDao) {
		super();
		this.employerUserDao = employerUserDao;
	}
	
	
}
