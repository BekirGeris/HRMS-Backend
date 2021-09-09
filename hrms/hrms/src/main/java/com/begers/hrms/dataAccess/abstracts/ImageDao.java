package com.begers.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.begers.hrms.entites.concoretes.Image;

@Repository
public interface ImageDao extends JpaRepository<Image, Integer>{

	Image getById(int id);
	
	Image getByCv_Id(int cvId);
	
}
