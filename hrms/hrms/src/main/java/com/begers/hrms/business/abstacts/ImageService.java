package com.begers.hrms.business.abstacts;

import java.util.List;

import org.springframework.stereotype.Service;

import com.begers.hrms.core.utilities.result.DataResult;
import com.begers.hrms.core.utilities.result.Result;
import com.begers.hrms.entites.concoretes.Image;

@Service
public interface ImageService {

	Result add(Image image);
	
	DataResult<List<Image>> getAll();
	
	DataResult<Image> getById(int id);
	
	DataResult<Image> getByCv_Id(int cvId);
}
