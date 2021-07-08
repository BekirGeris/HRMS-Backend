package com.begers.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.begers.hrms.entites.concoretes.City;

public interface CityDao extends JpaRepository<City, Integer>{

	City getById(int id);
	
}
