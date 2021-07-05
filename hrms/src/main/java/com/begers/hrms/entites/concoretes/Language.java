package com.begers.hrms.entites.concoretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Language {

	private int id;
	
	private String languageName;
	
	private int level;
	
	private Cv cv;
}
