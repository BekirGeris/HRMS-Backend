package com.begers.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.begers.hrms.entites.concoretes.SocialMediaAccount;

@Repository
public interface SocialMediaAccountDao extends JpaRepository<SocialMediaAccount, Integer>{

	SocialMediaAccount getById(int id);
	
	List<SocialMediaAccount> getByCv_Id(int cvId);
	
}
