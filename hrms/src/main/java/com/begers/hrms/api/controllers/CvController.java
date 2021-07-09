package com.begers.hrms.api.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.begers.hrms.business.abstacts.CvService;
import com.begers.hrms.core.utilities.result.DataResult;
import com.begers.hrms.core.utilities.result.ErrorDataResult;
import com.begers.hrms.core.utilities.result.Result;
import com.begers.hrms.entites.concoretes.Cv;

@RestController
@RequestMapping("/api/cv")
public class CvController {

	private CvService cvService;

	@Autowired
	public CvController(CvService cvService) {
		super();
		this.cvService = cvService;
	}
	
	@PostMapping("/add")
	Result add(@RequestBody Cv cv) {
		return this.cvService.add(cv);
	}
	
	@PostMapping("/delete")
	Result delete(@RequestParam int id) {
		return this.cvService.delete(id);
	}
	
	@GetMapping("/getAll")
	DataResult<List<Cv>> getAll(){
		return this.cvService.getAll();
	}
	
	@GetMapping("/findEmail")
	DataResult<Cv> findByEmail(@RequestParam String email){
		return this.cvService.findByEmail(email);
	}
	
	@GetMapping("findFirstAndLastName")
	DataResult<Cv> findByFirstNameAndLastName(@RequestParam String firstName, String lastName){
		return this.cvService.findByFirstNameAndLastName(firstName, lastName);
	}
	
	@GetMapping("getId")
	DataResult<Cv> getById(@RequestParam int id){
		return this.cvService.getById(id);
	}
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorDataResult<Object> handleValidationException
            (MethodArgumentNotValidException exceptions){
        Map<String,String> validationErrors = new HashMap<String, String>();
        for(FieldError fieldError : exceptions.getBindingResult().getFieldErrors()) {
            validationErrors.put(fieldError.getField(), fieldError.getDefaultMessage());
        }

        ErrorDataResult<Object> errors = new ErrorDataResult<Object>(validationErrors,"Validation errors");
        return errors;
    }
}
