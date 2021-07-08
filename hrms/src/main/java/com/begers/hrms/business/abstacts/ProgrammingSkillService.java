package com.begers.hrms.business.abstacts;

import java.util.List;

import org.springframework.stereotype.Service;

import com.begers.hrms.core.utilities.result.DataResult;
import com.begers.hrms.core.utilities.result.Result;
import com.begers.hrms.entites.concoretes.ProgrammingSkill;

@Service
public interface ProgrammingSkillService {

	Result add(ProgrammingSkill programmingSkill);
	
	DataResult<List<ProgrammingSkill>> getAll();
	
	DataResult<ProgrammingSkill> getById(int id);
	
	DataResult<List<ProgrammingSkill>> getByCv_Id(int cvId);
}
