package com.begers.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.begers.hrms.entites.concoretes.User;

@Repository
public interface UserDao extends JpaRepository<User, Integer>{
	
	List<User> findByEmail(String email);
	
}
