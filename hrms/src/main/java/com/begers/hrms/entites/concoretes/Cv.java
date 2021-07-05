package com.begers.hrms.entites.concoretes;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cv {

	private int id;
	
	private String firstName;
	
	private String lastName;
	
	private String identificationNumber;
	
	private Date birthDay;
	
	private CoverLetter coverLetter;
	
	private List<School> schools;
	
	private List<Language> languages;
	
	private List<ProgrammingSkill> programmingSkills;
	
	private List<JobExperience> jobExperiences;
	
	private Image image;
	
	private List<SocialMediaAccount> socialMediaAccounts;
}
