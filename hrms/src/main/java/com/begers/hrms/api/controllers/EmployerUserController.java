package com.begers.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.begers.hrms.business.abstacts.EmployerUserService;
import com.begers.hrms.entites.concoretes.EmployerUser;

@RestController
@RequestMapping("/api/Employers")
public class EmployerUserController {

	private EmployerUserService employerUserService;

	@Autowired
	public EmployerUserController(EmployerUserService employerUserService) {
		super();
		this.employerUserService = employerUserService;
	}
	
	@GetMapping("/getAll")
	public List<EmployerUser> getAll(){
		return null;
	}
	
}