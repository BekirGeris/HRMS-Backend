package com.begers.hrms.business.concoretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.begers.hrms.business.abstacts.ImageService;
import com.begers.hrms.core.utilities.result.DataResult;
import com.begers.hrms.core.utilities.result.Result;
import com.begers.hrms.core.utilities.result.SuccessDataResult;
import com.begers.hrms.core.utilities.result.SuccessResult;
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
		return null;
	}

	@Override
	public DataResult<Image> getByCv_Id(int cvId) {
		return new SuccessDataResult<Image>(this.imageDao.getByCv_Id(cvId), "Cv ye ait image bilgisi getirildi.");
	}

	@Override
	public Result add(Image image) {
		this.imageDao.save(image);
		return new SuccessResult("Image eklendi.");
	}

	@Override
	public DataResult<List<Image>> getAll() {
		return new SuccessDataResult<List<Image>>(this.imageDao.findAll(), "Tüm image tavblosu listelendi.");
	}
}
