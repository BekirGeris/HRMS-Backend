package com.begers.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.begers.hrms.entites.concoretes.JopPositions;

public interface JopPositionsDao extends JpaRepository<JopPositions, Integer>{

}
