package com.begers.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.begers.hrms.business.abstacts.SocialMediaAccountService;
import com.begers.hrms.core.utilities.result.DataResult;
import com.begers.hrms.core.utilities.result.Result;
import com.begers.hrms.entites.concoretes.SocialMediaAccount;

@CrossOrigin
@RestController
@RequestMapping("/api/SocialMediaAccount")
public class SocialMediaAccountController {

	SocialMediaAccountService socialMediaAccountService;

	@Autowired
	public SocialMediaAccountController(SocialMediaAccountService socialMediaAccountService) {
		super();
		this.socialMediaAccountService = socialMediaAccountService;
	}
	
	@PostMapping("/add")
	public Result add(SocialMediaAccount socialMediaAccount) {
		return this.socialMediaAccountService.add(socialMediaAccount);
	}

	@GetMapping("/getAll")
	public DataResult<List<SocialMediaAccount>> getAll() {
		return this.socialMediaAccountService.getAll();
	}

	@GetMapping("/getById")
	public DataResult<SocialMediaAccount> getById(int id) {
		return this.socialMediaAccountService.getById(id);
	}

	@GetMapping("/getByCv_Id")
	public DataResult<List<SocialMediaAccount>> getByCv_Id(int cvId) {
		return this.socialMediaAccountService.getByCv_Id(cvId);
	}
	
}
