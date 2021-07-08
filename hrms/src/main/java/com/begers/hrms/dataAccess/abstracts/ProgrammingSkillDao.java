package com.begers.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.begers.hrms.entites.concoretes.ProgrammingSkill;

public interface ProgrammingSkillDao extends JpaRepository<ProgrammingSkill, Integer>{

}
