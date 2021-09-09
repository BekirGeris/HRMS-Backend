package com.begers.hrms.business.concoretes;

import java.util.List;

import org.springframework.stereotype.Service;

import com.begers.hrms.business.abstacts.StaffUserService;
import com.begers.hrms.core.utilities.result.DataResult;
import com.begers.hrms.core.utilities.result.SuccessDataResult;
import com.begers.hrms.dataAccess.abstracts.StaffUserDao;
import com.begers.hrms.entites.concoretes.StaffUser;

@Service
public class StaffUserManager implements StaffUserService{

	private StaffUserDao staffUserDao;

	public StaffUserManager(StaffUserDao staffUserDao) {
		super();
		this.staffUserDao = staffUserDao;
	}

	@Override
	public DataResult<List<StaffUser>> getAll() {
		return new SuccessDataResult<List<StaffUser>>(staffUserDao.findAll(), "Sistem personelleri listelendi");
	}
	
	
}
