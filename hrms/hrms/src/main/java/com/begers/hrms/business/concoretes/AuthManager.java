package com.begers.hrms.business.concoretes;	

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.begers.hrms.business.abstacts.AuthService;
import com.begers.hrms.core.adapters.EmailService;
import com.begers.hrms.core.adapters.MernisService;
import com.begers.hrms.dataAccess.abstracts.UserDao;

@Service
public class AuthManager implements AuthService {

	UserDao userDao;
	MernisService mernisService;
	EmailService emailService;

	String messageDetail = "";

	@Autowired
	public AuthManager(UserDao userDao, MernisService mernisService, EmailService emailService) {
		this.userDao = userDao;
		this.mernisService = mernisService;
		this.emailService = emailService;
	}

	@Override
	public boolean checkEmail(String email) {
		this.messageDetail = "";

		if (!this.emailService.isOkay(email)) {
			this.messageDetail += "Gerçek bir email adresi giriniz.";
			return false;
		}

		if (!this.userDao.findByEmail(email).isEmpty()) {
			this.messageDetail += "Girdiginiz mail zaten sistemde mevcut.";
			return false;
		}

		return true;
	}

	@Override
	public boolean checkIdentificationNumber(String identificationNumber) {
		this.messageDetail = "";

		if (!this.mernisService.isOkay(identificationNumber)) {
			this.messageDetail += "Tc numarası 11 hane olmak zorunda.";
			return false;
		}

		return true;
	}

	@Override
	public boolean checkingCenter(String email, String identificationNumber) {
		return this.checkEmail(email) && this.checkIdentificationNumber(identificationNumber);
	}

	@Override
	public String getMessage() {
		return this.messageDetail;
	}

}
