package com.begers.hrms.business.concoretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.begers.hrms.business.abstacts.JopPositionService;
import com.begers.hrms.core.utilities.result.DataResult;
import com.begers.hrms.core.utilities.result.Result;
import com.begers.hrms.core.utilities.result.SuccessDataResult;
import com.begers.hrms.core.utilities.result.SuccessResult;
import com.begers.hrms.dataAccess.abstracts.JopPositionsDao;
import com.begers.hrms.entites.concoretes.JopPositions;

@Service
public class JopPositionsManager implements JopPositionService{

	private JopPositionsDao jopPositionsDao;
	
	
	@Autowired
	public JopPositionsManager(JopPositionsDao jopPositionsDao) {
		super();
		this.jopPositionsDao = jopPositionsDao;
	}

	@Override
	public DataResult<List<JopPositions>> gatAll() {
		return new SuccessDataResult<List<JopPositions>>(this.jopPositionsDao.findAll(), "Posizyonlar listelendi");
	}

	@Override
	public Result add(JopPositions jopPositions) {
		this.jopPositionsDao.save(jopPositions);
		return new SuccessResult("Posizyon eklendi");
	}

}
