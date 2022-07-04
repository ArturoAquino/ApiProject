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

import com.promineo.student_enrollment.model.Classes;
import com.promineo.student_enrollment.service.ClassesService;

@RestController
@RequestMapping("/studentenrollment/class")
public class ClassesController {
	private ClassesService classesService;
	
	public ClassesController(ClassesService classesService) {
		super();
		this.classesService = classesService;
	}
	
	@PostMapping()
	public ResponseEntity<Classes> saveClasses(@RequestBody Classes classes) {
		return new ResponseEntity<Classes>(classesService.saveClasses(classes), HttpStatus.CREATED);
	}

	@GetMapping
	public List<Classes> getAllClasses(){
		return classesService.getAllClasses();
	}
	
	@GetMapping("{subject_id}")
	public ResponseEntity<Classes> getClassesById(@PathVariable("subject_id") int subjectId) {
		return new ResponseEntity<Classes>(classesService.getClassesById(subjectId), HttpStatus.OK);
		}
	
	@PutMapping("{subject_id}")
	public ResponseEntity<Classes> updateClasses(@PathVariable("subject_id") int subjectId, @RequestBody Classes classes) {
		return new ResponseEntity<Classes>(classesService.updateClasses(classes, subjectId), HttpStatus.OK);
	}
	
	@DeleteMapping("{subject_id}")
	public ResponseEntity<String> deleteClasses(@PathVariable("subject_id") int subject_id) {
		classesService.deleteClasses(subject_id);
		return new ResponseEntity<String>("Class was deleted.", HttpStatus.OK);
	}
	
}
