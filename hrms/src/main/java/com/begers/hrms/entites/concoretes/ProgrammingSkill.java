package com.begers.hrms.entites.concoretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProgrammingSkill {

	private int id;
	
	private String programOrTechnologyName;
	
	private Cv cv;
}
