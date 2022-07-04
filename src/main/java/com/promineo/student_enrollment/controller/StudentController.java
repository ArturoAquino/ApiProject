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

import com.promineo.student_enrollment.model.Student;
import com.promineo.student_enrollment.service.StudentService;

@RestController
@RequestMapping("/studentenrollment/student")
public class StudentController {

	private StudentService studentService;
	
	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}
	
	@PostMapping()
	public ResponseEntity<Student> saveStudent(@RequestBody Student student) {
		return new ResponseEntity<Student>(studentService.saveStudent(student), HttpStatus.CREATED);
	}
	
	@GetMapping
	public List<Student> getAllStudents() {
		return studentService.getAllStudents();
	}
	
	@GetMapping("{student_id}")
	public ResponseEntity<Student> getStudentById(@PathVariable ("student_id") int studentId) {
		return new ResponseEntity<Student>(studentService.getStudentById(studentId), HttpStatus.OK);
	}
	
	@PutMapping("{student_id}")
	public ResponseEntity<Student> updateStudent(@PathVariable("student_id") int studentId, @RequestBody Student student) {
		return new ResponseEntity<Student>(studentService.updateStudent(student, studentId), HttpStatus.OK);
	}
	
	@DeleteMapping("{student_id}")
	public ResponseEntity<String> deleteStudent(@PathVariable("student_id") int studentId) {
		studentService.deleteStudent(studentId);
		return new ResponseEntity<String>("Student has been removed.", HttpStatus.OK);
	}
}
