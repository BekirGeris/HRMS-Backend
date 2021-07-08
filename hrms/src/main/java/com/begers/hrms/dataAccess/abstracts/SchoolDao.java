package com.begers.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.begers.hrms.entites.concoretes.School;

public interface SchoolDao extends JpaRepository<SchoolDao, Integer>{
	
	School getById(int id);
	
	List<School> getByCv_Id(int cvId);
	
}
