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
@Table(name="Job_Experience")
public class JobExperience {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id")
	private int id;
	
	@Column(name="Workplace_Name")
	private String workplaceName;
	
	@Column(name="Job_Positions")
	private String jobPositions;
	
	@Column(name="Starting_Job_Date")
	private LocalDate startingJobDate;
	
	@Column(name="End_Job_Date")
	private LocalDate endJobDate;
	
	@ManyToOne()
    @JoinColumn(name = "Cv_Id")
	private Cv cv;
}
