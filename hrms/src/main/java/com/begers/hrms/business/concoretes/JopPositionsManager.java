package com.begers.hrms.business.concoretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.begers.hrms.business.abstacts.JopPositionService;
import com.begers.hrms.dataAccess.abstracts.JopPositionsDao;
import com.begers.hrms.entites.concoretes.JopPositions;

@Service
public class JopPositionsManager implements JopPositionService{

	JopPositionsDao jopPositionsDao;
	
	
	@Autowired
	public JopPositionsManager(JopPositionsDao jopPositionsDao) {
		super();
		this.jopPositionsDao = jopPositionsDao;
	}

	@Override
	public List<JopPositions> gatAll() {
		System.out.println(jopPositionsDao.findAll().toString());
		return this.jopPositionsDao.findAll();
	}

}
