package com.begers.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.begers.hrms.entites.concoretes.JobExperience;


@Repository
public interface JobExperienceDao extends JpaRepository<JobExperience, Integer>{

	JobExperience getById(int id);
	
	List<JobExperience> getByCv_Id(int cvId);
}
