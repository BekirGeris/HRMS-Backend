package com.begers.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.begers.hrms.entites.concoretes.ProgrammingSkill;

@Repository
public interface ProgrammingSkillDao extends JpaRepository<ProgrammingSkill, Integer>{

	ProgrammingSkill getById(int id);
	
	List<ProgrammingSkill> getByCv_Id(int cvId);
}
