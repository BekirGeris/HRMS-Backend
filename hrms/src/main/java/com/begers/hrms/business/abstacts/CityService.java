package com.begers.hrms.business.abstacts;

import java.util.List;

import org.springframework.stereotype.Service;

import com.begers.hrms.core.utilities.result.DataResult;
import com.begers.hrms.core.utilities.result.Result;
import com.begers.hrms.entites.concoretes.City;

@Service
public interface CityService {
	
	Result add(City city);
	
	DataResult<List<City>> getAll();
	
	DataResult<City> getById(int id);
	
}
