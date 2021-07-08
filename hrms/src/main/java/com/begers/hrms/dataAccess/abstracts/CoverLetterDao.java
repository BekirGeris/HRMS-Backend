package com.begers.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.begers.hrms.entites.concoretes.CoverLetter;

@Repository
public interface CoverLetterDao extends JpaRepository<CoverLetter, Integer>{

	CoverLetter getById(int id);
	
	CoverLetter getByCv_Id(int cvId);
	
}
