package com.begers.hrms.business.concoretes;

import com.begers.hrms.business.abstacts.UserService;
import com.begers.hrms.dataAccess.abstracts.UserDao;

public class UserManager implements UserService{

	private UserDao userDao;

	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}
	
	
}
