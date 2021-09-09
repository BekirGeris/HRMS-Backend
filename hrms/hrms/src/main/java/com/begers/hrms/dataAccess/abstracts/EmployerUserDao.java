package com.begers.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.begers.hrms.entites.concoretes.EmployerUser;

@Repository
public interface EmployerUserDao extends JpaRepository<EmployerUser, Integer>{

}
