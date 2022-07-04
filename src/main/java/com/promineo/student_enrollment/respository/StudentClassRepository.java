package com.promineo.student_enrollment.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.promineo.student_enrollment.model.StudentClass;

@Repository
public interface StudentClassRepository extends JpaRepository<StudentClass, Integer>{

}
