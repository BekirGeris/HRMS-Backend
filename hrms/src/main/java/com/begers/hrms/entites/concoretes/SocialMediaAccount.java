package com.begers.hrms.entites.concoretes;

import java.net.URL;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Social_Media_Account")
public class SocialMediaAccount {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id")
	private int id;
	
	@Column(name="Social_Media_Account_Name")
	private String socialMediaAccountName;
	
	@Column(name="Social_Media_Account_Url")
	private String socialMediaAccountUrl;
	
	@ManyToOne()
    @JoinColumn(name = "Cv_Id")
	private Cv cv;
}
