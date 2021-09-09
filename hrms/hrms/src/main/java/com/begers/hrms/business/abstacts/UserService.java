package com.begers.hrms.business.abstacts;

import java.util.List;

import org.springframework.stereotype.Service;

import com.begers.hrms.core.utilities.result.DataResult;
import com.begers.hrms.entites.concoretes.User;

@Service
public interface UserService {
	DataResult<List<User>> getAll();
}
