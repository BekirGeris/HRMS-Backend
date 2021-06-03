package com.begers.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.begers.hrms.business.abstacts.JobSeekerUserService;
import com.begers.hrms.core.utilities.result.DataResult;
import com.begers.hrms.core.utilities.result.Result;
import com.begers.hrms.entites.concoretes.JobSeekerUser;

@RestController
@RequestMapping("/api/JobSeekers")
public class JobSeekerUserController {

	private JobSeekerUserService jobSeekerUserService;

	@Autowired
	public JobSeekerUserController(JobSeekerUserService jobSeekerUserService) {
		super();
		this.jobSeekerUserService = jobSeekerUserService;
	}
	
	@GetMapping("/getAll")
	public DataResult<List<JobSeekerUser>> getAll(){
		return this.jobSeekerUserService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(JobSeekerUser jobSeekerUser) {
		return this.jobSeekerUserService.add(jobSeekerUser);
	}
}
