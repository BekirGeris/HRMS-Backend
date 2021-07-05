package com.begers.hrms.entites.concoretes;

import java.net.URL;
import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Image {

	private int id;
	
	private URL imageUrl;
	
	private LocalDate creationDate;
	
}
