package com.begers.hrms.business.concoretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.begers.hrms.business.abstacts.JobPositionService;
import com.begers.hrms.core.utilities.result.DataResult;
import com.begers.hrms.core.utilities.result.ErrorResult;
import com.begers.hrms.core.utilities.result.Result;
import com.begers.hrms.core.utilities.result.SuccessDataResult;
import com.begers.hrms.core.utilities.result.SuccessResult;
import com.begers.hrms.dataAccess.abstracts.JobPositionsDao;
import com.begers.hrms.entites.concoretes.JobPositions;

@Service
public class JobPositionsManager implements JobPositionService{

	private JobPositionsDao jobPositionsDao;
	
	@Autowired
	public JobPositionsManager(JobPositionsDao jobPositionsDao) {
		super();
		this.jobPositionsDao = jobPositionsDao;
	}

	@Override
	public DataResult<List<JobPositions>> gatAll() {
		return new SuccessDataResult<List<JobPositions>>(this.jobPositionsDao.findAll(), "Posizyonlar listelendi");
	}

	@Override
	public Result add(JobPositions jobPositions) {
		
		if (jobPositions.getJobName().equals("")) {
			return new ErrorResult("Pozisyon adi boş olamaz.");
		}
		
		if (jobPositionsDao.findByJobName(jobPositions.getJobName()) != null) {
			if (jobPositionsDao.findByJobName(jobPositions.getJobName()).getJobName().toLowerCase().equals(jobPositions.getJobName().toLowerCase())) {
				return new ErrorResult("Bu pozisyon adı zaten var.");
			}
		}
		
		this.jobPositionsDao.save(jobPositions);
		return new SuccessResult("Posizyon eklendi.");
	}

}
