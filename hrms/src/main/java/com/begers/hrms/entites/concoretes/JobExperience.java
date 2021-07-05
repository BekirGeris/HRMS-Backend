package com.begers.hrms.entites.concoretes;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobExperience {

	private int id;
	
	private String workplaceName;
	
	private JobPositions jobPositions;
	
	private LocalDate startingJobDate;
	
	private LocalDate endJobDate;
	
	private Cv cv;
}
