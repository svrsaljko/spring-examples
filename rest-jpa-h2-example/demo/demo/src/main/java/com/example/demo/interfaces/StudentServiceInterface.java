package com.example.demo.interfaces;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Student;

/*
 * Methods for CRUD operations in database 
 * */
public interface StudentServiceInterface {

	List<Student> getAllStudents();

	Optional<Student> getStudentById(Long id);

	void deleteStudent(Long id);

	Student createStudent(Student student);

	String udpateStudentCollege(Student student);

}