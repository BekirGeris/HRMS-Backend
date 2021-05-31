package com.begers.hrms.entites.concoretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode (callSuper = false)
@Entity
@Table(name="Employers")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobAdvertisements"})
@AllArgsConstructor
@NoArgsConstructor
public class EmployerUser extends User{
	
	@Column(name="CompanyName")
	private String companyName;
	
	@Column(name="WebSitesi")
	private String webSite;
	
	@Column(name="Telefon")
	private String telephoneNumber;
	
	@OneToMany(mappedBy = "employerUser")
	private List<JobAdvertisement> jobAdvertisements;
	
}
