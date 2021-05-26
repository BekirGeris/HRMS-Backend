package com.begers.hrms.business.concoretes;

import java.util.List;

import com.begers.hrms.business.abstacts.StaffUserService;
import com.begers.hrms.dataAccess.abstracts.StaffUserDao;
import com.begers.hrms.entites.concoretes.StaffUser;

public class StaffUserManager implements StaffUserService{

	private StaffUserDao staffUserDao;

	public StaffUserManager(StaffUserDao staffUserDao) {
		super();
		this.staffUserDao = staffUserDao;
	}

	@Override
	public List<StaffUser> getAll() {
		return staffUserDao.findAll();
	}
	
	
}
