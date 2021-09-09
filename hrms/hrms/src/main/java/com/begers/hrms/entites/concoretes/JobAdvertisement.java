package com.begers.hrms.entites.concoretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper=false)
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="job_advertisement")
public class JobAdvertisement {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="is_active")
	private boolean active;
	
	@Column(name="remote")
	private boolean remote;
	
	@Column(name="full_time")
	private boolean fullTime;
	
	@Column(name="job_description")
	private String jobDescription;
	
	@Column(name="min_salary")
	private float minSalary;
	
	@Column(name="max_salary")
	private float maxSalary;
	
	@Column(name="number_of_open_positions")
	private int numberOfOpenPositions;
	
	@Column(name="application_deadline")
	private LocalDate applicationDeadline;

	@JsonIgnore
	@Column(name="listing_date")
	private LocalDate listingDate = LocalDate.now();

	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="position_id")
	private JobPositions jobPositions;

	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="user_id") 
	private EmployerUser employerUser;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="city_id")
	private City city;
	

//	@Column(name = "user_id")
//	private int userId;

//	@Column(name = "job_position_id")
//	private int jobPositionId;

//	@Column(name = "city_id")
//	private String cityId;
	
}
