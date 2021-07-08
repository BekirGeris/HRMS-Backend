package com.begers.hrms.business.concoretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.begers.hrms.business.abstacts.ImageService;
import com.begers.hrms.core.utilities.result.DataResult;
import com.begers.hrms.dataAccess.abstracts.ImageDao;
import com.begers.hrms.entites.concoretes.Image;

@Service
public class ImageManager implements ImageService{

	private ImageDao imageDao;
	
	@Autowired
	public ImageManager(ImageDao imageDao) {
		super();
		this.imageDao = imageDao;
	}

	@Override
	public DataResult<Image> getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<Image> getByCv_Id(int cvId) {
		// TODO Auto-generated method stub
		return null;
	}
}
