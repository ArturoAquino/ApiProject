package com.promineo.student_enrollment.service;

import java.util.List;

import com.promineo.student_enrollment.model.Student;

public interface StudentService {
	Student saveStudent(Student student);

	// handles list of students
	List<Student> getAllStudents();
	
	//handles student by ID
	Student getStudentById(int id);
	
	//for the update student
	Student updateStudent(Student student, int Id);
	
	// deletes a student
	void deleteStudent(int Id);
}
