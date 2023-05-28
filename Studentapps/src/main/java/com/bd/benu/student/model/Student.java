package com.bd.benu.student.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "STUDENT_MASTER")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "SID")
	private Integer stdId;
	
	@Column(name = "NAME")
	private String stdName;
	
	@Column(name = "EMAIL")
	private String stdEmail;
	
	@Column(name = "MOBILE")
	private String stdMobile;
	
	@Column(name = "GENDER")
	private String stdGender;

}
