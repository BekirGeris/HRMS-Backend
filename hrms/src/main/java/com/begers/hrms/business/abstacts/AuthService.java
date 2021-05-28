package com.begers.hrms.business.abstacts;

public interface AuthService {
	
	boolean checkEmail(String email);
	
	boolean checkIdentificationNumber(String identificationNumber);
	
	boolean checkingCenter(String email, String identificationNumber);
	
	String getMessage();
}
