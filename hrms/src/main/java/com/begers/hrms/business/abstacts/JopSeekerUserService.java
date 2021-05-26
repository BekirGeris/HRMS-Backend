package com.begers.hrms.business.abstacts;

import java.util.List;

import org.springframework.stereotype.Service;

import com.begers.hrms.core.utilities.result.DataResult;
import com.begers.hrms.core.utilities.result.Result;
import com.begers.hrms.entites.concoretes.JopSeekerUser;

@Service
public interface JopSeekerUserService {
	DataResult<List<JopSeekerUser>> getAll();
	
	Result add(JopSeekerUser jopSeekerUser);
}
