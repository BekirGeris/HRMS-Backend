package com.begers.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.begers.hrms.entites.concoretes.Language;

public interface LanguageDao extends JpaRepository<Language, Integer>{

	Language getById(int id);
	
	List<Language> getByCv_Id(int cvId);
	
}
