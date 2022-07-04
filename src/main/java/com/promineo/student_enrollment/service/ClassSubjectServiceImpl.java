package com.promineo.student_enrollment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.promineo.student_enrollment.exception.ResourceNotFoundException;
import com.promineo.student_enrollment.model.ClassSubject;
import com.promineo.student_enrollment.respository.ClassSubjectRepository;

@Service
public class ClassSubjectServiceImpl implements ClassSubjectService {
	
	private ClassSubjectRepository classSubjectRepository;
	
	@Autowired 
	public ClassSubjectServiceImpl(ClassSubjectRepository classSubjectRepository) {
		super();
		this.classSubjectRepository = classSubjectRepository;
	}

	@Override
	public ClassSubject saveClassSubject(ClassSubject classSubject) {
		return classSubjectRepository.save(classSubject);
	}
	
	@Override
	public List<ClassSubject> getAllClassSubject() {
		return classSubjectRepository.findAll();
	}

	@Override
	public ClassSubject getClassSubjectById(int subjectId) {
		return classSubjectRepository.findById(subjectId).orElseThrow(() -> new ResourceNotFoundException("ClassSubject", "class_subject", subjectId));
	}
	
	@Override
	public ClassSubject updateClassSubject(ClassSubject classSubject, int subjectId) {
		ClassSubject existingClassSubject = classSubjectRepository.findById(subjectId).orElseThrow(() -> new ResourceNotFoundException("ClassSubject", "class_subject", subjectId));
		
		existingClassSubject.setPrerequisite(classSubject.getPrerequisite());
		existingClassSubject.setMax_capacity(classSubject.getMax_capacity());
	
		classSubjectRepository.save(existingClassSubject);
		
		return existingClassSubject;
	}

	@Override
	public void deleteClassSubject(int subjectId) {
		ClassSubject existingClassSubject = classSubjectRepository.findById(subjectId).orElseThrow(() -> new ResourceNotFoundException("ClassSubject", "class_subject", subjectId));
		classSubjectRepository.deleteById(subjectId);
	}
	
}
