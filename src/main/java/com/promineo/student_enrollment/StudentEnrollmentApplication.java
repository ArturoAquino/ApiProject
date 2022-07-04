package com.promineo.student_enrollment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan()
public class StudentEnrollmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentEnrollmentApplication.class, args);
	}

}
