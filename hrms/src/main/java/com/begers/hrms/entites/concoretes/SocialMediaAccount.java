package com.begers.hrms.entites.concoretes;

import java.net.URL;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SocialMediaAccount {

	private int id;
	
	private String ocialMediaAccountName;
	
	private URL ocialMediaAccountUrl;
	
	private Cv cv;
}
