package com.begers.hrms.entites.concoretes;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Cv")
public class Cv {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id")
	private int id;
	
	@Column(name="First_Name")
	private String firstName;
	
	@Column(name="Last_Name")
	private String lastName;
	
	@Column(name="Birth_Day")
	private Date birthDay;
	
	private CoverLetter coverLetter;
	
	private List<School> schools;
	
	private List<Language> languages;
	
	private List<ProgrammingSkill> programmingSkills;
	
	private List<JobExperience> jobExperiences;
	
	private Image image;
	
	private List<SocialMediaAccount> socialMediaAccounts;
}
