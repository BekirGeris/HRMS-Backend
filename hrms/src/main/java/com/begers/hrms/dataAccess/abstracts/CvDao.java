package com.begers.hrms.dataAccess.abstracts;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.begers.hrms.entites.concoretes.Cv;

@Repository
public interface CvDao extends JpaRepository<Cv, Integer>{
	
	Cv findByEmail(String email);
	
	Cv findByFirstNameAndLastName(String firstName, String lastName);
	
	Cv getById(int id);
	
	Cv deleteById(int id);
	
}
