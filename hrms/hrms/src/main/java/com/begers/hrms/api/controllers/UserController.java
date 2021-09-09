package com.begers.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.begers.hrms.business.abstacts.UserService;
import com.begers.hrms.core.utilities.result.DataResult;
import com.begers.hrms.entites.concoretes.User;

@CrossOrigin
@RestController
@RequestMapping("/api/Users")
public class UserController {

	private UserService userService;

	@Autowired
	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}
	
	@GetMapping("/getAll")
	public DataResult<List<User>> getAll(){
		return this.userService.getAll();
	}
}
