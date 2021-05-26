package com.begers.hrms.business.concoretes;

import com.begers.hrms.business.abstacts.StaffUserService;
import com.begers.hrms.dataAccess.abstracts.StaffUserDao;

public class StaffUserManager implements StaffUserService{

	private StaffUserDao staffUserDao;

	public StaffUserManager(StaffUserDao staffUserDao) {
		super();
		this.staffUserDao = staffUserDao;
	}
	
	
}
