package com.begers.hrms.entites.concoretes;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class School {

	private int id;
	
	private String schoolName;
	
	private String department;
	
	private LocalDate startingDate;
	
	private LocalDate endDate;
	
	private Cv cv;
}
