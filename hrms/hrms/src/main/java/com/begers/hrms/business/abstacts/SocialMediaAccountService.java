package com.begers.hrms.business.abstacts;

import java.util.List;

import org.springframework.stereotype.Service;

import com.begers.hrms.core.utilities.result.DataResult;
import com.begers.hrms.core.utilities.result.Result;
import com.begers.hrms.entites.concoretes.SocialMediaAccount;

@Service
public interface SocialMediaAccountService {
	
	Result add(SocialMediaAccount socialMediaAccount);
	
	DataResult<List<SocialMediaAccount>> getAll();

	DataResult<SocialMediaAccount> getById(int id);
	
	DataResult<List<SocialMediaAccount>> getByCv_Id(int cvId);
}
