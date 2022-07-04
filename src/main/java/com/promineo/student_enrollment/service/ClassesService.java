package com.promineo.student_enrollment.service;

import java.util.List;

import com.promineo.student_enrollment.model.Classes;

public interface ClassesService {
	Classes saveClasses(Classes classes);

	List<Classes> getAllClasses();
	
	Classes getClassesById(int subjectId);
	
	Classes updateClasses(Classes classes, int subjectId);
	
	void deleteClasses(int subjectId);
}
