package com.begers.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.begers.hrms.entites.concoretes.Language;

@Repository
public interface LanguageDao extends JpaRepository<Language, Integer>{

	Language getById(int id);
	
	List<Language> getByCv_Id(int cvId);
	
}
