package com.begers.hrms.core.adapters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.begers.hrms.FakeServices.FakeMernisManager;

@Service
public class MernisAdapter implements MernisService{

	@Autowired
	FakeMernisManager fakeEmailManager;
	
	@Override
	public boolean isOkay(String identityNumber) {
		return this.fakeEmailManager.isOkay(identityNumber);
	}

}
