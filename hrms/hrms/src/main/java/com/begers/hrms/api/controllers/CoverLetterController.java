package com.begers.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.begers.hrms.business.abstacts.CoverLetterService;
import com.begers.hrms.core.utilities.result.DataResult;
import com.begers.hrms.core.utilities.result.Result;
import com.begers.hrms.entites.concoretes.CoverLetter;

@CrossOrigin
@RestController
@RequestMapping("/api/CoverLetter")
public class CoverLetterController {

	CoverLetterService coverLetterService;

	@Autowired
	public CoverLetterController(CoverLetterService coverLetterService) {
		super();
		this.coverLetterService = coverLetterService;
	}
	
	@GetMapping("/getById")
	public DataResult<CoverLetter> getById(int id) {
		return this.coverLetterService.getById(id);
	}

	@GetMapping("/getByCv_Id")
	public DataResult<CoverLetter> getByCv_Id(int cvId) {
		return this.coverLetterService.getByCv_Id(cvId);
	}
	
	@PostMapping("/add")
	public Result add(CoverLetter coverLetter) {
		return this.coverLetterService.add(coverLetter);
	}

	@GetMapping("/getAll")
	public DataResult<List<CoverLetter>> getAll() {
		return this.coverLetterService.getAll();
	}
}
