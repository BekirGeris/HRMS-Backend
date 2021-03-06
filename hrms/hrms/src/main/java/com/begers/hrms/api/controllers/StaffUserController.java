package com.begers.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.begers.hrms.business.abstacts.StaffUserService;
import com.begers.hrms.core.utilities.result.DataResult;
import com.begers.hrms.entites.concoretes.StaffUser;

@CrossOrigin
@RestController
@RequestMapping("/api/SystemStaffs")
public class StaffUserController {

	private StaffUserService staffUserService;

	@Autowired
	public StaffUserController(StaffUserService staffUserService) {
		super();
		this.staffUserService = staffUserService;
	}
	
	@GetMapping("/getAll")
	public DataResult<List<StaffUser>> getAll(){
		return this.staffUserService.getAll();
	}
}
