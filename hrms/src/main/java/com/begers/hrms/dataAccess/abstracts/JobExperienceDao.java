package com.begers.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.begers.hrms.entites.concoretes.JobExperience;


public interface JobExperienceDao extends JpaRepository<JobExperience, Integer>{

}
