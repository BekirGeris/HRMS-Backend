package com.begers.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.begers.hrms.business.abstacts.JobExperienceService;
import com.begers.hrms.core.utilities.result.DataResult;
import com.begers.hrms.core.utilities.result.Result;
import com.begers.hrms.entites.concoretes.JobExperience;

public class JobExpericeController {

	JobExperienceService jobExperienceService;

	@Autowired
	public JobExpericeController(JobExperienceService jobExperienceService) {
		super();
		this.jobExperienceService = jobExperienceService;
	}
	
	@GetMapping("/getById")
	public DataResult<JobExperience> getById(int id) {
		return this.jobExperienceService.getById(id);
	}

	@GetMapping("/getByCv_Id")
	public DataResult<List<JobExperience>> getByCv_Id(int cvId) {
		return this.jobExperienceService.getByCv_Id(cvId);
	}

	@PostMapping("/add")
	public Result add(JobExperience jobExperience) {
		return this.jobExperienceService.add(jobExperience);
	}

	@GetMapping("/getAll")
	public DataResult<List<JobExperience>> getAll() {
		return this.jobExperienceService.getAll();
	}
}
