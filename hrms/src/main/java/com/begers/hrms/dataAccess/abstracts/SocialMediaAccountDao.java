package com.begers.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.begers.hrms.entites.concoretes.SocialMediaAccount;

public interface SocialMediaAccountDao extends JpaRepository<SocialMediaAccount, Integer>{

	SocialMediaAccount getById(int id);
	
	List<SocialMediaAccount> getByCv_Id(int cvId);
	
}
