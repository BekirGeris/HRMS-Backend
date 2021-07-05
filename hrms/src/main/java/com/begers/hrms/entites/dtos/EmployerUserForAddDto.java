package com.begers.hrms.entites.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployerUserForAddDto {
	
	private String companyName;
	private String website;
	private String telephoneNumber;
	private String email;
	private String password;
	private String againPassword;
	
}
