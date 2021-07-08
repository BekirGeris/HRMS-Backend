package com.begers.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.begers.hrms.entites.concoretes.JobExperience;


public interface JobExperienceDao extends JpaRepository<JobExperience, Integer>{

	JobExperience getById(int id);
	
	List<JobExperience> getByCv_Id(int cvId);
}
