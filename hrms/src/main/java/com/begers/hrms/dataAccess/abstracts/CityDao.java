package com.begers.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.begers.hrms.entites.concoretes.City;

@Repository
public interface CityDao extends JpaRepository<City, Integer>{

	City getById(int id);
	
}
