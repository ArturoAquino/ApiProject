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
@Table(name = "class")
public class Classes {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int subject_id;
	
	@Column(value = "teacher_fname")
	private String teacher_fname;
	@Column(value = "teacher_lname")
	private String teacher_lname;
	@Column(value = "class_name")
	private String class_name;
	
	
}
