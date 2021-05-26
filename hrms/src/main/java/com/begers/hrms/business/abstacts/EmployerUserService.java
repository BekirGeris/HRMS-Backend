package com.begers.hrms.business.abstacts;

import java.util.List;

import org.springframework.stereotype.Service;

import com.begers.hrms.entites.concoretes.EmployerUser;

@Service
public interface EmployerUserService {
	List<EmployerUser> getAll(); 
}
