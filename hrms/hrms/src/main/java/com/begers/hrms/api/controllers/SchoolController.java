package com.begers.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.begers.hrms.business.abstacts.SchoolService;

@CrossOrigin
@RestController
@RequestMapping("/api/School")
public class SchoolController {

	SchoolService schoolService;

	@Autowired
	public SchoolController(SchoolService schoolService) {
		super();
		this.schoolService = schoolService;
	}
	
	
}
