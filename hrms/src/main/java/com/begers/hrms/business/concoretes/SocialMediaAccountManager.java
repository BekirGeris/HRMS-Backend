package com.begers.hrms.business.concoretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.begers.hrms.business.abstacts.SocialMediaAccountService;
import com.begers.hrms.core.utilities.result.DataResult;
import com.begers.hrms.dataAccess.abstracts.SocialMediaAccountDao;
import com.begers.hrms.entites.concoretes.SocialMediaAccount;

@Service
public class SocialMediaAccountManager implements SocialMediaAccountService{

	private SocialMediaAccountDao socialMediaAccountDao;
	
	@Autowired
	public SocialMediaAccountManager(SocialMediaAccountDao socialMediaAccountDao) {
		super();
		this.socialMediaAccountDao = socialMediaAccountDao;
	}

	@Override
	public DataResult<SocialMediaAccount> getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<List<SocialMediaAccount>> getByCv_Id(int cvId) {
		// TODO Auto-generated method stub
		return null;
	}
}
