package com.begers.hrms.entites.concoretes;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Cv")
public class Cv {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Cv_Id")
	private int id;
	
	@Column(name="First_Name")
	private String firstName;
	
	@Column(name="Last_Name")
	private String lastName;
	
	@Column(name="Birth_Day")
	private Date birthDay;
	
	@JsonIgnore
	@OneToMany(mappedBy="cv")
	private CoverLetter coverLetter;
	
	@JsonIgnore
	@OneToMany(mappedBy="cv")
	private List<School> schools;
	
	@JsonIgnore
	@OneToMany(mappedBy="cv")
	private List<Language> languages;
	
	@JsonIgnore
	@OneToMany(mappedBy="cv")
	private List<ProgrammingSkill> programmingSkills;
	
	@JsonIgnore
	@OneToMany(mappedBy="cv")
	private List<JobExperience> jobExperiences;
	
	@JsonIgnore
	@OneToMany(mappedBy="cv")
	private Image image;
	             
	@JsonIgnore
	@OneToMany(mappedBy="cv")
	private List<SocialMediaAccount> socialMediaAccounts;
}
