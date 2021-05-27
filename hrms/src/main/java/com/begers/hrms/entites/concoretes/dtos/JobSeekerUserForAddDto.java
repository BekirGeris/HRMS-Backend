package com.begers.hrms.entites.concoretes.dtos;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobSeekerUserForAddDto {
	
	private String firstName;
	private String lastName;
	private String identificationNumber;
	private Date birthDay;
	private String email;
	private String password;
	private String againPassword;
}
