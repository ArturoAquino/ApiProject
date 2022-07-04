package com.promineo.student_enrollment.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.promineo.student_enrollment.model.ClassSubject;
import com.promineo.student_enrollment.service.ClassSubjectService;

@RestController
@RequestMapping("/studentenrollment/class_subject")
public class ClassSubjectController {

	private ClassSubjectService classSubjectService;
	
	public ClassSubjectController(ClassSubjectService classSubjectService) {
		super();
		this.classSubjectService = classSubjectService;
	}
	
	@PostMapping()
	public ResponseEntity<ClassSubject> saveClassSubject(@RequestBody ClassSubject classSubject) {
		return new ResponseEntity<ClassSubject>(classSubjectService.saveClassSubject(classSubject), HttpStatus.CREATED);
	}

	@GetMapping
	public List<ClassSubject> getAllClassSubject() {
		return classSubjectService.getAllClassSubject();
	}
	
	@GetMapping("{subject_id}")
	public ResponseEntity<ClassSubject> getClassSubjectById(@PathVariable("subject_id") int subjectId) {
		return new ResponseEntity<ClassSubject>(classSubjectService.getClassSubjectById(subjectId), HttpStatus.OK);
	}
	
	@PutMapping("{subject_id}")
	public ResponseEntity<ClassSubject> updateClassSubject(@PathVariable("subject_id") int subjectId, @RequestBody ClassSubject classSubject) {
		return new ResponseEntity<ClassSubject>(classSubjectService.updateClassSubject(classSubject, subjectId), HttpStatus.OK);
	}
	
	@DeleteMapping("{subject_id}")
	public ResponseEntity<String> deleteClassSubject(@PathVariable("subject_id") int subjectId) {
		classSubjectService.deleteClassSubject(subjectId);
		return new ResponseEntity<String>("Class subject deleted", HttpStatus.OK);
	}
	
}
