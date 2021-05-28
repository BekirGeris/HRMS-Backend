package com.begers.hrms.business.concoretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.begers.hrms.business.abstacts.AuthService;
import com.begers.hrms.business.abstacts.EmployerUserService;
import com.begers.hrms.core.utilities.result.DataResult;
import com.begers.hrms.core.utilities.result.ErrorResult;
import com.begers.hrms.core.utilities.result.Result;
import com.begers.hrms.core.utilities.result.SuccessDataResult;
import com.begers.hrms.core.utilities.result.SuccessResult;
import com.begers.hrms.dataAccess.abstracts.EmployerUserDao;
import com.begers.hrms.entites.concoretes.EmployerUser;

@Service
public class EmployerUserManager implements EmployerUserService{

	private EmployerUserDao employerUserDao;
	private AuthService authService;

	@Autowired
	public EmployerUserManager(EmployerUserDao employerUserDao, AuthService authService) {
		super();
		this.employerUserDao = employerUserDao;
		this.authService = authService;
	}

	@Override
	public DataResult<List<EmployerUser>> getAll() {
		return new SuccessDataResult<List<EmployerUser>>(this.employerUserDao.findAll(), "Isverenler listelendi");
	}

	@Override
	public Result add(EmployerUser employerUser) {
		
		if (this.authService.checkEmail(employerUser.getEmail())) {
			
			this.employerUserDao.save(employerUser);
			return new SuccessResult("Is veren ekleme basarili");
			
		}
		
		return new ErrorResult(this.authService.getMessage());
	}
	
	
}
