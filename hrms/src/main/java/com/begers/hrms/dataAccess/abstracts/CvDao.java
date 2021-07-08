package com.begers.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.begers.hrms.entites.concoretes.Cv;

public interface CvDao extends JpaRepository<Cv, Integer>{

}
