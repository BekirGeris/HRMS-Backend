package com.begers.hrms.entites.concoretes;

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
@Table(name="Employers")
@AllArgsConstructor
@NoArgsConstructor
public class EmployerUser extends User{
	
	@Column(name="CompanyName")
	private String companyName;
	
	@Column(name="WebSitesi")
	private String webSie;
	
	@Column(name="Telefon")
	private String telephoneNumber;
	
}
