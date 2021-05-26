package com.begers.hrms.business.abstacts;

import java.util.List;

import org.springframework.stereotype.Service;

import com.begers.hrms.core.utilities.result.DataResult;
import com.begers.hrms.core.utilities.result.Result;
import com.begers.hrms.entites.concoretes.JopPositions;

@Service
public interface JopPositionService {
	DataResult<List<JopPositions>> gatAll();
	
	Result add(JopPositions jopPositions);
}
