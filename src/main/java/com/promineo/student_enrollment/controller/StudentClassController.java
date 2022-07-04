package com.promineo.student_enrollment.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.promineo.student_enrollment.model.StudentClass;
import com.promineo.student_enrollment.service.StudentClassService;

@RestController
@RequestMapping("/studentenrollment/student_class")
public class StudentClassController {

	private StudentClassService studentClassSerivce;
	
	public StudentClassController(StudentClassService studentClassSerivce) {
		super();
		this.studentClassSerivce = studentClassSerivce;
	}
	
	@PostMapping()
	public ResponseEntity<StudentClass> saveStudentClass(@RequestBody StudentClass studentClass) {
		return new ResponseEntity<StudentClass>(studentClassSerivce.saveStudentClass(studentClass), HttpStatus.CREATED);
	}
	
	@GetMapping
	public List<StudentClass> getAllStudentClass() {
		return studentClassSerivce.getAllStudentClass();
	}
	
	
}
