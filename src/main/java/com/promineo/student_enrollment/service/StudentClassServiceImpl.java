package com.promineo.student_enrollment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.promineo.student_enrollment.exception.ResourceNotFoundException;
import com.promineo.student_enrollment.model.StudentClass;
import com.promineo.student_enrollment.respository.StudentClassRepository;

@Service
public class StudentClassServiceImpl implements StudentClassService{

	private StudentClassRepository studentClassRepository;

	@Autowired
	public StudentClassServiceImpl(StudentClassRepository studentClassRepository) {
		super();
		this.studentClassRepository = studentClassRepository;
	}
	
	@Override
	public StudentClass saveStudentClass(StudentClass studentClass) {
		return studentClassRepository.save(studentClass);
	}
	
	@Override
	public List<StudentClass> getAllStudentClass() {
		return studentClassRepository.findAll();
	}
	
	@Override
	public void deleteStudentClass(int studentId) {
		StudentClass existingStudentClass = studentClassRepository.findById(studentId).orElseThrow(() -> new ResourceNotFoundException("StudentClass", "student_id", studentId));
		studentClassRepository.deleteById(studentId);
	}
	
}
