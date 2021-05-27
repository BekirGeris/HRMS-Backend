package com.begers.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.begers.hrms.entites.concoretes.JobPositions;

@Repository
public interface JobPositionsDao extends JpaRepository<JobPositions, Integer>{
	
	JobPositions findByPositionName(String jobName);
	
}
