package com.begers.hrms.business.concoretes;

import java.util.List;

import org.springframework.stereotype.Service;

import com.begers.hrms.business.abstacts.UserService;
import com.begers.hrms.core.utilities.result.DataResult;
import com.begers.hrms.core.utilities.result.SuccessDataResult;
import com.begers.hrms.dataAccess.abstracts.UserDao;
import com.begers.hrms.entites.concoretes.User;

@Service
public class UserManager implements UserService{

	private UserDao userDao;

	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public DataResult<List<User>> getAll() {
		return new SuccessDataResult<List<User>>(userDao.findAll(), "Kullanıcılar Listelendi");
	}
	
	
}
