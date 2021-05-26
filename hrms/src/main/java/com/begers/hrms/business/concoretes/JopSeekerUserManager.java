package com.begers.hrms.business.concoretes;

import java.util.List;

import com.begers.hrms.business.abstacts.JopSeekerUserService;
import com.begers.hrms.dataAccess.abstracts.JopSeekerUserDao;
import com.begers.hrms.entites.concoretes.JopSeekerUser;

public class JopSeekerUserManager implements JopSeekerUserService{

	private JopSeekerUserDao jopSeekerUserDao;

	public JopSeekerUserManager(JopSeekerUserDao jopSeekerUserDao) {
		super();
		this.jopSeekerUserDao = jopSeekerUserDao;
	}

	@Override
	public List<JopSeekerUser> getAll() {
		return jopSeekerUserDao.findAll();
	}
	
	
}
