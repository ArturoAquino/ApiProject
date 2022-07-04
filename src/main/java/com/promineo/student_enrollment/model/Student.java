package com.promineo.student_enrollment.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.relational.core.mapping.Column;

import lombok.Data;

@Data
@Entity
@Table(name="student")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int student_id;
	
	@Column(value = "first_name")
	private String first_name;
	@Column(value = "last_name")
	private String last_name;
	@Column(value = "date_of_birth")
	private String date_of_birth;
	
}
