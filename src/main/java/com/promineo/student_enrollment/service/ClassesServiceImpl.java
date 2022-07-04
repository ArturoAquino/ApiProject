package com.promineo.student_enrollment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.promineo.student_enrollment.exception.ResourceNotFoundException;
import com.promineo.student_enrollment.model.Classes;
import com.promineo.student_enrollment.respository.ClassesRepository;

@Service
public class ClassesServiceImpl implements ClassesService{
	
	private ClassesRepository classesRepository;
	
	@Autowired
	public ClassesServiceImpl(ClassesRepository classesRepository) {
		super();
		this.classesRepository = classesRepository;
	}
	
	@Override
	public Classes saveClasses(Classes classes) {
		return classesRepository.save(classes);
	}
	
	@Override
	public List<Classes> getAllClasses() {
		return classesRepository.findAll();
	}

	@Override
	public Classes getClassesById(int subjectId) {
		// TODO Auto-generated method stub
		return classesRepository.findById(subjectId).orElseThrow(() -> new ResourceNotFoundException("Classes", "subject_id", subjectId));
	}

	@Override
	public Classes updateClasses(Classes classes, int subjectId) {
		
		Classes existingClasses = classesRepository.findById(subjectId).orElseThrow(() -> new ResourceNotFoundException("Classes", "subject_id", subjectId));
		
		existingClasses.setTeacher_fname(classes.getTeacher_fname());
		existingClasses.setTeacher_lname(classes.getTeacher_lname());
		
		classesRepository.save(existingClasses);
		
		return existingClasses;
	}

	@Override
	public void deleteClasses(int subjectId) {
		Classes existingClasses = classesRepository.findById(subjectId).orElseThrow(() -> new ResourceNotFoundException("Classes", "subject_id", subjectId));
		classesRepository.deleteById(subjectId);
	}
	
	
}
