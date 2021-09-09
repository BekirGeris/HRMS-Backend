package com.begers.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.begers.hrms.entites.concoretes.JobAdvertisement;

@Repository
public interface JobAdvertisementDao extends  JpaRepository<JobAdvertisement, Integer>{

	JobAdvertisement getById(int id);
	
	List<JobAdvertisement> getByActive(boolean active);
	
	List<JobAdvertisement> getByActive(boolean active, Sort sort);
	
	List<JobAdvertisement> getByActiveAndEmployerUser_CompanyName(boolean active, String employerName);
}
