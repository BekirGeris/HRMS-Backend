package com.begers.hrms.business.concoretes;

import com.begers.hrms.business.abstacts.JopSeekerUserService;
import com.begers.hrms.dataAccess.abstracts.JopSeekerUserDao;

public class JopSeekerUserManager implements JopSeekerUserService{

	private JopSeekerUserDao jopSeekerUserDao;

	public JopSeekerUserManager(JopSeekerUserDao jopSeekerUserDao) {
		super();
		this.jopSeekerUserDao = jopSeekerUserDao;
	}
	
	
}
