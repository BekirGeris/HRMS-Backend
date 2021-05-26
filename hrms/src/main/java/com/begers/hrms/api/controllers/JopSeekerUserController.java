package com.begers.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.begers.hrms.business.abstacts.JopSeekerUserService;
import com.begers.hrms.core.utilities.result.DataResult;
import com.begers.hrms.core.utilities.result.Result;
import com.begers.hrms.entites.concoretes.JopSeekerUser;

@RestController
@RequestMapping("/api/JopSeekers")
public class JopSeekerUserController {

	private JopSeekerUserService jopSeekerUserService;

	@Autowired
	public JopSeekerUserController(JopSeekerUserService jopSeekerUserService) {
		super();
		this.jopSeekerUserService = jopSeekerUserService;
	}
	
	@GetMapping("/getAll")
	public DataResult<List<JopSeekerUser>> getAll(){
		return this.jopSeekerUserService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(JopSeekerUser jopSeekerUser) {
		return this.jopSeekerUserService.add(jopSeekerUser);
	}
}
