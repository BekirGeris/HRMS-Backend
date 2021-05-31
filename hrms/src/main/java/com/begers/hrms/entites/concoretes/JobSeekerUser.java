package com.begers.hrms.entites.concoretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode (callSuper = false)
@Entity
@Table(name="Job_Seekers")
@AllArgsConstructor
@NoArgsConstructor
public class JobSeekerUser extends User{

	@Column(name="FirstName")
	private String firstName;
	
	@Column(name="LastName")
	private String lastName;
	
	@Column(name="IdentificationNumber")
	private String identificationNumber;
	
	@Column(name="DateOfBirth")
	private Date birthDay;

}
