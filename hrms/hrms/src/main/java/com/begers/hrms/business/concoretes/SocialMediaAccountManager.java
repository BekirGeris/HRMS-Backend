package com.begers.hrms.business.concoretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.begers.hrms.business.abstacts.SocialMediaAccountService;
import com.begers.hrms.core.utilities.result.DataResult;
import com.begers.hrms.core.utilities.result.Result;
import com.begers.hrms.core.utilities.result.SuccessDataResult;
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
		return new SuccessDataResult<SocialMediaAccount>(this.socialMediaAccountDao.getById(id), "Social media bilgisi getirildi.");
	}

	@Override
	public DataResult<List<SocialMediaAccount>> getByCv_Id(int cvId) {
		return new SuccessDataResult<List<SocialMediaAccount>>(this.socialMediaAccountDao.getByCv_Id(cvId), "Cv ye ait social media bilgisi getirildi.");
	}

	@Override
	public Result add(SocialMediaAccount socialMediaAccount) {
		this.socialMediaAccountDao.save(socialMediaAccount);
		return null;
	}

	@Override
	public DataResult<List<SocialMediaAccount>> getAll() {
		return new SuccessDataResult<List<SocialMediaAccount>>(this.socialMediaAccountDao.findAll(), "tüm social media bilgisi listelendi.");
	}
}
