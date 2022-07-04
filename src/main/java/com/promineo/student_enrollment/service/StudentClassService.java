package com.promineo.student_enrollment.service;

import java.util.List;

import com.promineo.student_enrollment.model.StudentClass;

public interface StudentClassService {

	StudentClass saveStudentClass(StudentClass studentClass);

	List<StudentClass> getAllStudentClass();

	void deleteStudentClass(int studentId);
}
