package com.begers.hrms.business.abstacts;

import org.springframework.stereotype.Service;

import com.begers.hrms.core.utilities.result.DataResult;
import com.begers.hrms.entites.concoretes.Image;

@Service
public interface ImageService {

	DataResult<Image> getById(int id);
	
	DataResult<Image> getByCv_Id(int cvId);
}
