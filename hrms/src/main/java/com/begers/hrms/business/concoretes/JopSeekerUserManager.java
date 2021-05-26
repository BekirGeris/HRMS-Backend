package com.begers.hrms.business.concoretes;

import java.util.List;

import org.springframework.stereotype.Service;

import com.begers.hrms.business.abstacts.JopSeekerUserService;
import com.begers.hrms.core.utilities.result.DataResult;
import com.begers.hrms.core.utilities.result.Result;
import com.begers.hrms.core.utilities.result.SuccessDataResult;
import com.begers.hrms.core.utilities.result.SuccessResult;
import com.begers.hrms.dataAccess.abstracts.JopSeekerUserDao;
import com.begers.hrms.entites.concoretes.JopSeekerUser;

@Service
public class JopSeekerUserManager implements JopSeekerUserService{

	private JopSeekerUserDao jopSeekerUserDao;

	public JopSeekerUserManager(JopSeekerUserDao jopSeekerUserDao) {
		super();
		this.jopSeekerUserDao = jopSeekerUserDao;
	}

	@Override
	public DataResult<List<JopSeekerUser>> getAll() {
		return new SuccessDataResult<List<JopSeekerUser>>(jopSeekerUserDao.findAll(), "Is arayanlar listelendi");
	}

	@Override
	public Result add(JopSeekerUser jopSeekerUser) {
		this.jopSeekerUserDao.save(jopSeekerUser);
		return new SuccessResult("Is arayan ekleme basarili");
	}
	
	
}
