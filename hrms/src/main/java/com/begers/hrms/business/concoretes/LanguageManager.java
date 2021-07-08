package com.begers.hrms.business.concoretes;

import java.util.List;

import org.springframework.stereotype.Service;

import com.begers.hrms.business.abstacts.LanguageService;
import com.begers.hrms.core.utilities.result.DataResult;
import com.begers.hrms.core.utilities.result.Result;
import com.begers.hrms.core.utilities.result.SuccessDataResult;
import com.begers.hrms.core.utilities.result.SuccessResult;
import com.begers.hrms.dataAccess.abstracts.LanguageDao;
import com.begers.hrms.entites.concoretes.Language;

@Service
public class LanguageManager implements LanguageService{

	private LanguageDao languageDao;
	
	public LanguageManager(LanguageDao languageDao) {
		super();
		this.languageDao = languageDao;
	}

	@Override
	public DataResult<Language> getById(int id) {
		return new SuccessDataResult<Language>(this.languageDao.getById(id), "Language getirildi.");
	}

	@Override
	public DataResult<List<Language>> getByCv_Id(int cvId) {
		return new SuccessDataResult<List<Language>>(this.languageDao.getByCv_Id(cvId), "Cv ye ait languages listelendi.");
	}

	@Override
	public Result add(Language language) {
		this.languageDao.save(language);
		return new SuccessResult("language eklendi.");
	}
}
