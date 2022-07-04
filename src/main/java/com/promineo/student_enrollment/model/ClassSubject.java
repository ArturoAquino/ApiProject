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
@Table(name = "class_subject")
public class ClassSubject {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int subject_id;
	@Column(value = "prerequisite")
	private String prerequisite;
	@Column(value = "max_capacity")
	private String max_capacity;
	
}
