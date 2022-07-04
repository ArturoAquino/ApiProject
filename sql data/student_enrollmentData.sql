-- Student
INSERT INTO student (student_id, first_name, last_name, date_of_birth) VALUES(2, 'Ashley', 'Jones', '12-01-2006');
INSERT INTO student (student_id, first_name, last_name, date_of_birth) VALUES(3, 'Keyaan', 'West', '01-12-2002');
INSERT INTO student (student_id, first_name, last_name, date_of_birth) VALUES(4, 'Nate', 'Lee', '08-21-1999');
INSERT INTO student (student_id, first_name, last_name, date_of_birth) VALUES(5, 'Dianne', 'Talbot', '02-21-2002');
INSERT INTO student (student_id, first_name, last_name, date_of_birth) VALUES(6, 'Allen', 'Nelson', '07-01-1995');

-- Class
INSERT INTO class(subject_id, teacher_fname, teacher_lname, class_name) VALUES (1, 'Veronica', 'Smith', 'Biology 10');
INSERT INTO class(subject_id, teacher_fname, teacher_lname, class_name) VALUES (2, 'Samantha', 'Gomez', 'Math 20');
INSERT INTO class(subject_id, teacher_fname, teacher_lname, class_name) VALUES (3, 'Josh', 'Smith', 'Biology 10');
INSERT INTO class(subject_id, teacher_fname, teacher_lname, class_name) VALUES (4, 'Mark', 'Wayne', 'Physics 10');
INSERT INTO class(subject_id, teacher_fname, teacher_lname, class_name) VALUES (5, 'Veronica', 'Smith', 'History 120');

-- class_subject
INSERT INTO class_subject (subject_id, prerequisite, max_capacity) VALUES (1, 'None', 30);
INSERT INTO class_subject (subject_id, prerequisite, max_capacity) VALUES (2, 'Math 10', 45);
INSERT INTO class_subject (subject_id, prerequisite, max_capacity) VALUES (3, 'Biology 101', 40);
INSERT INTO class_subject (subject_id, prerequisite, max_capacity) VALUES (4, 'None', 100);
INSERT INTO class_subject (subject_id, prerequisite, max_capacity) VALUES (5, 'History 10', 45);
