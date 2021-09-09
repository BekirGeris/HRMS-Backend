package com.begers.hrms.business.concoretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.begers.hrms.business.abstacts.CoverLetterService;
import com.begers.hrms.core.utilities.result.DataResult;
import com.begers.hrms.core.utilities.result.Result;
import com.begers.hrms.core.utilities.result.SuccessDataResult;
import com.begers.hrms.core.utilities.result.SuccessResult;
import com.begers.hrms.dataAccess.abstracts.CoverLetterDao;
import com.begers.hrms.entites.concoretes.CoverLetter;

@Service
public class CoverLetterManager implements CoverLetterService{

	private CoverLetterDao coverLetterDao;
	
	@Autowired
	public CoverLetterManager(CoverLetterDao coverLetterDao) {
		super();
		this.coverLetterDao = coverLetterDao;
	}

	@Override
	public DataResult<CoverLetter> getById(int id) {
		return new SuccessDataResult<CoverLetter>(this.coverLetterDao.getById(id), "CoverLetter Getirildi.");
	}

	@Override
	public DataResult<CoverLetter> getByCv_Id(int cvId) {
		return new SuccessDataResult<CoverLetter>(this.coverLetterDao.getByCv_Id(cvId), "Cv ye ait bilgiler getirildi.");
	}

	@Override
	public Result add(CoverLetter coverLetter) {
		this.coverLetterDao.save(coverLetter);
		return new SuccessResult("CoverLetter eklendi.");
	}

	@Override
	public DataResult<List<CoverLetter>> getAll() {
		return new SuccessDataResult<List<CoverLetter>>(this.coverLetterDao.findAll(), "Bilgiler listelendi");
	}
}
