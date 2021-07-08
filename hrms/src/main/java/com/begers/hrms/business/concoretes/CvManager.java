package com.begers.hrms.business.concoretes;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.begers.hrms.business.abstacts.CoverLetterService;
import com.begers.hrms.business.abstacts.CvService;
import com.begers.hrms.business.abstacts.ImageService;
import com.begers.hrms.business.abstacts.JobExperienceService;
import com.begers.hrms.business.abstacts.LanguageService;
import com.begers.hrms.business.abstacts.ProgrammingSkillService;
import com.begers.hrms.business.abstacts.SchoolService;
import com.begers.hrms.business.abstacts.SocialMediaAccountService;
import com.begers.hrms.core.utilities.result.DataResult;
import com.begers.hrms.core.utilities.result.Result;
import com.begers.hrms.core.utilities.result.SuccessDataResult;
import com.begers.hrms.core.utilities.result.SuccessResult;
import com.begers.hrms.dataAccess.abstracts.CvDao;
import com.begers.hrms.entites.concoretes.Cv;

@Service
public class CvManager implements CvService {

	private CvDao cvDao;

	@Autowired
	public CvManager(CvDao cvDao) {
		super();
		this.cvDao = cvDao;
	}

	@Override
	public DataResult<Cv> findByEmail(String email) {
		return new SuccessDataResult<Cv>(this.cvDao.findByEmail(email), "Cv getirildi.");
	}

	@Override
	public DataResult<Cv> findByFirstNameAndLastName(String firstName, String lastName) {
		return new SuccessDataResult<Cv>(this.cvDao.findByFirstNameAndLastName(firstName, lastName), "Cv getirildi.");
	}

	@Override
	public DataResult<Cv> getById(int id) {
		return null;
	}

	@Override
	public Result add(Cv cv) {
		this.cvDao.save(cv);
		return new SuccessResult("Cv eklendi.");
	}

	@Override
	public Result delete(int id) {
		this.cvDao.deleteById(id);
		return new SuccessResult("Cv silindi.");
	}

	@Override
	public DataResult<List<Cv>> getAll() {
		return new SuccessDataResult<List<Cv>>(this.cvDao.findAll(), "Tüm cv ler listelendi");
	}

}
