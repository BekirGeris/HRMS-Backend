package com.begers.hrms.business.abstacts;

import java.util.List;

import org.springframework.stereotype.Service;

import com.begers.hrms.core.utilities.result.DataResult;
import com.begers.hrms.core.utilities.result.Result;
import com.begers.hrms.entites.concoretes.Language;

@Service
public interface LanguageService {

	Result add(Language language);
	
	DataResult<Language> getById(int id);
	
	DataResult<List<Language> > getByCv_Id(int cvId);
}
