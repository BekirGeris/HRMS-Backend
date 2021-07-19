package com.begers.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.begers.hrms.business.abstacts.JobAdvertisementService;
import com.begers.hrms.core.utilities.result.DataResult;
import com.begers.hrms.core.utilities.result.Result;
import com.begers.hrms.entites.concoretes.JobAdvertisement;

@CrossOrigin
@RestController
@RequestMapping("/api/Advertisement")
public class JobAdvertisementController {

	JobAdvertisementService jobAdvertisementService;

	@Autowired
	public JobAdvertisementController(JobAdvertisementService jobAdvertisementService) {
		super();
		this.jobAdvertisementService = jobAdvertisementService;
	}
	
	@GetMapping("/getAll")
	public DataResult<List<JobAdvertisement>> getAll(){
		return this.jobAdvertisementService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(JobAdvertisement jobAdvertisement) {
		return this.jobAdvertisementService.add(jobAdvertisement);
	}
	
	@GetMapping("/getAllActive")
	public DataResult<List<JobAdvertisement>> getByActiveJobAdvertisement(){
		return this.jobAdvertisementService.getByActiveJobAdvertisement();
	}
	
	@GetMapping("/getAllActiveSorted")
	public DataResult<List<JobAdvertisement>> getByActiveSortedJobAdvertisement(@RequestParam int value){
		return this.jobAdvertisementService.getAllActiveSortedJodAdvertisement(value);
	}
	
	@GetMapping("/getAllActiveAndEmployerName")
	public DataResult<List<JobAdvertisement>> getByActiveAndEmployerName(@RequestParam String employerName){
		return this.jobAdvertisementService.getAllActiveAndEmployerName(employerName);
	}
	
	@GetMapping("/changedActivated")
	public Result changedActivated(int jobAdvertisementId) {
		return this.jobAdvertisementService.changedActivated(jobAdvertisementId);
	}
}
