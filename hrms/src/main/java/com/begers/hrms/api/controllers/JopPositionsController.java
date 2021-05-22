package com.begers.hrms.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.begers.hrms.business.abstacts.JopPositionService;
import com.begers.hrms.entites.concoretes.JopPositions;

@RestController
@RequestMapping("/api/JopPositions")
public class JopPositionsController {
	
	private JopPositionService jopPositionService;

	public JopPositionsController(JopPositionService jopPositionService) {
		super();
		this.jopPositionService = jopPositionService;
	}
	
	@GetMapping("getAll")
	public List<JopPositions> getAll(){
		return this.jopPositionService.gatAll();
	}
}
