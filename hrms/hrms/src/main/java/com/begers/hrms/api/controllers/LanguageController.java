package com.begers.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.begers.hrms.business.abstacts.LanguageService;
import com.begers.hrms.core.utilities.result.DataResult;
import com.begers.hrms.core.utilities.result.Result;
import com.begers.hrms.entites.concoretes.Language;

@CrossOrigin
@RestController
@RequestMapping("/api/Language")
public class LanguageController {

	LanguageService languageService;

	@Autowired
	public LanguageController(LanguageService languageService) {
		super();
		this.languageService = languageService;
	}
	
	@PostMapping("/add")
	public Result add(Language language) {
		return this.languageService.add(language);
	}

	@GetMapping("/getById")
	public DataResult<Language> getById(int id) {
		return this.languageService.getById(id);
	}

	@GetMapping("/getByCv_Id")
	public DataResult<List<Language>> getByCv_Id(int cvId) {
		return this.languageService.getByCv_Id(cvId);
	}
}
