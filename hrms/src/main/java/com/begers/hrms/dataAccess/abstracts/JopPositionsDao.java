package com.begers.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.begers.hrms.entites.concoretes.JopPositions;

@Repository
public interface JopPositionsDao extends JpaRepository<JopPositions, Integer>{

}
