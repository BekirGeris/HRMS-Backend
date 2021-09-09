package com.begers.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.begers.hrms.business.abstacts.ImageService;
import com.begers.hrms.core.utilities.result.DataResult;
import com.begers.hrms.core.utilities.result.Result;
import com.begers.hrms.entites.concoretes.Image;

@CrossOrigin
@RestController
@RequestMapping("/api/Image")
public class ImageController {

	ImageService imageService;

	@Autowired
	public ImageController(ImageService imageService) {
		super();
		this.imageService = imageService;
	}

	@PostMapping("/add")
	public Result add(Image image) {
		return this.imageService.add(image);
	}

	@GetMapping("/getAll")
	public DataResult<List<Image>> getAll() {
		return this.imageService.getAll();
	}

	@GetMapping("/getById")
	public DataResult<Image> getById(int id) {
		return this.imageService.getById(id);
	}

	@GetMapping("/getByCv_Id")
	public DataResult<Image> getByCv_Id(int cvId) {
		return this.imageService.getByCv_Id(cvId);
	}
	
	
}
