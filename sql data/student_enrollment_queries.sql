CREATE TABLE student (
	student_id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    first_name VARCHAR(30) NOT NULL,
    last_name VARCHAR(30) NOT NULL,
    date_of_birth VARCHAR(10) NOT NULL,

	PRIMARY KEY (student_id)
);

CREATE TABLE class(
    subject_id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    teacher_fname VARCHAR(30) NOT NULL,
    teacher_lname VARCHAR(30) NOT NULL,
    
    PRIMARY KEY (subject_id),
    FOREIGN KEY (subject_id) REFERENCES class_subject(subject_id)
);


CREATE TABLE class_subject(
	subject_id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    prerequisite VARCHAR(30),
    max_capacity INT NOT NULL,
    
    PRIMARY KEY (subject_id)
);

CREATE TABLE student_class (
	student_id INT UNSIGNED NOT NULL,
    class_id INT UNSIGNED NOT NULL,
    
	FOREIGN KEY (student_id) REFERENCES student(student_id),
    FOREIGN KEY (class_id) REFERENCES class(class_id)
)