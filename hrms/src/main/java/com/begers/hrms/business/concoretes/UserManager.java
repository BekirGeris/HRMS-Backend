package com.begers.hrms.business.concoretes;

import java.util.List;

import com.begers.hrms.business.abstacts.UserService;
import com.begers.hrms.dataAccess.abstracts.UserDao;
import com.begers.hrms.entites.concoretes.User;

public class UserManager implements UserService{

	private UserDao userDao;

	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public List<User> getAll() {
		return userDao.findAll();
	}
	
	
}
