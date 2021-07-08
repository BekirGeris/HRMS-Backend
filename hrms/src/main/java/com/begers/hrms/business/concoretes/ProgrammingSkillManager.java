package com.begers.hrms.business.concoretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.begers.hrms.business.abstacts.ProgrammingSkillService;
import com.begers.hrms.core.utilities.result.DataResult;
import com.begers.hrms.core.utilities.result.Result;
import com.begers.hrms.core.utilities.result.SuccessDataResult;
import com.begers.hrms.core.utilities.result.SuccessResult;
import com.begers.hrms.dataAccess.abstracts.ProgrammingSkillDao;
import com.begers.hrms.entites.concoretes.ProgrammingSkill;

@Service
public class ProgrammingSkillManager implements ProgrammingSkillService{
	
	private ProgrammingSkillDao programmingSkillDao;
	
	@Autowired
	public ProgrammingSkillManager(ProgrammingSkillDao programmingSkillDao) {
		super();
		this.programmingSkillDao = programmingSkillDao;
	}

	@Override
	public DataResult<ProgrammingSkill> getById(int id) {
		return new SuccessDataResult<ProgrammingSkill>(this.programmingSkillDao.getById(id), "Skill getirildi.");
	}

	@Override
	public DataResult<List<ProgrammingSkill>> getByCv_Id(int cvId) {
		return new SuccessDataResult<List<ProgrammingSkill>>(this.programmingSkillDao.getByCv_Id(cvId), "Cv ye ait tüm skills listelendi.");
	}

	@Override
	public Result add(ProgrammingSkill programmingSkill) {
		this.programmingSkillDao.save(programmingSkill);
		return new SuccessResult("Skill eklendi.");
	}

	@Override
	public DataResult<List<ProgrammingSkill>> getAll() {
		return new SuccessDataResult<List<ProgrammingSkill>>(this.programmingSkillDao.findAll(), "Tüm skills listelendi.");
	}
}
