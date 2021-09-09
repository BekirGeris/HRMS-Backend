package com.begers.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.begers.hrms.business.abstacts.ProgrammingSkillService;
import com.begers.hrms.core.utilities.result.DataResult;
import com.begers.hrms.core.utilities.result.Result;
import com.begers.hrms.entites.concoretes.ProgrammingSkill;

@CrossOrigin
@RestController
@RequestMapping("/api/ProgrammingSkill")
public class ProgrammingSkillController {

	ProgrammingSkillService programmingSkillService;

	@Autowired
	public ProgrammingSkillController(ProgrammingSkillService programmingSkillService) {
		super();
		this.programmingSkillService = programmingSkillService;
	}
	
	@PostMapping("/add")
	public Result add(ProgrammingSkill programmingSkill) {
		return this.programmingSkillService.add(programmingSkill);
	}

	@GetMapping("/getAll")
	public DataResult<List<ProgrammingSkill>> getAll() {
		return this.programmingSkillService.getAll();
	}

	@GetMapping("/getById")
	public DataResult<ProgrammingSkill> getById(int id) {
		return this.programmingSkillService.getById(id);
	}

	@GetMapping("/getByCv_Id")
	public DataResult<List<ProgrammingSkill>> getByCv_Id(int cvId) {
		return this.programmingSkillService.getByCv_Id(cvId);
	}
}
