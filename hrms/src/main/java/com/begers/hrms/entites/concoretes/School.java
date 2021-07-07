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

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="school")
public class School {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="School_Name")
	private String schoolName;
	
	@Column(name="Department")
	private String department;
	
	@Column(name="Starting Date")
	private LocalDate startingDate;
	
	@Column(name="End_Date")
	private LocalDate endDate;
	
	@ManyToOne()
    @JoinColumn(name = "Cv_Id")
	private Cv cv;
}
