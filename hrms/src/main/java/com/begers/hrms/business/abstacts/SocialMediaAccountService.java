package com.begers.hrms.business.abstacts;

import java.util.List;

import org.springframework.stereotype.Service;

import com.begers.hrms.core.utilities.result.DataResult;
import com.begers.hrms.entites.concoretes.SocialMediaAccount;

@Service
public interface SocialMediaAccountService {

	DataResult<SocialMediaAccount> getById(int id);
	
	DataResult<List<SocialMediaAccount>> getByCv_Id(int cvId);
}
