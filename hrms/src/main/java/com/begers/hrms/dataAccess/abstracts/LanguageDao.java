package com.begers.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.begers.hrms.entites.concoretes.Language;

public interface LanguageDao extends JpaRepository<Language, Integer>{

}
