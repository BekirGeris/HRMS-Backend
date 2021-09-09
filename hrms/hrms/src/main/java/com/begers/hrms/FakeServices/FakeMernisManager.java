package com.begers.hrms.FakeServices;

import org.springframework.stereotype.Component;

@Component
public class FakeMernisManager {

	public boolean isOkay(String identityNumber) {
		return identityNumber.length() == 11 ? true : false;
	}
}
