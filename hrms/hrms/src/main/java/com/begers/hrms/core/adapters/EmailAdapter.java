package com.begers.hrms.core.adapters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.begers.hrms.FakeServices.FakeEmailManager;

@Service
public class EmailAdapter implements EmailService{

	@Autowired
	FakeEmailManager fakeEmailManager;
	
	@Override
	public boolean isOkay(String email) {
		return this.fakeEmailManager.isOkay(email);
	}

}
