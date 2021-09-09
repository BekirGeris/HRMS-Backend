package com.begers.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.begers.hrms.business.abstacts.CityService;
import com.begers.hrms.core.utilities.result.DataResult;
import com.begers.hrms.core.utilities.result.Result;
import com.begers.hrms.entites.concoretes.City;

@CrossOrigin
@RestController
@RequestMapping("/api/City")
public class CityController {

	CityService cityService;

	@Autowired
	public CityController(CityService cityService) {
		super();
		this.cityService = cityService;
	}
	
	@GetMapping("/getById")
	public DataResult<City> getById(int id) {
		return this.cityService.getById(id);
	}

	@PostMapping("/add")
	public Result add(City city) {
		return this.cityService.add(city);
	}

	@GetMapping("/getAll")
	public DataResult<List<City>> getAll() {
		return this.cityService.getAll();
	}
}
