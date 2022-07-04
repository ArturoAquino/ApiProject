package com.promineo.student_enrollment.service;

import java.util.List;

import com.promineo.student_enrollment.model.ClassSubject;

public interface ClassSubjectService {
	ClassSubject saveClassSubject(ClassSubject classSubject);

	List<ClassSubject> getAllClassSubject();
	
	ClassSubject getClassSubjectById(int subjectId);

	ClassSubject updateClassSubject(ClassSubject classSubject, int subjectId);

	void deleteClassSubject(int subjectId);
}
