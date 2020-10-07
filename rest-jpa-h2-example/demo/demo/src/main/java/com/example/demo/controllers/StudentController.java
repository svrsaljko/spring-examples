package com.example.demo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.interfaces.StudentServiceInterface;
import com.example.demo.model.Student;


/*
 * StudentController class provides REST API for Student
 * */
@RestController
public class StudentController {

	@Autowired
	StudentServiceInterface studentService;

	
	// Return all students
	@GetMapping("student/all")
	public ResponseEntity<List<Student>> getAllStudents() {

		return ResponseEntity.ok(studentService.getAllStudents());

	}

	
	// Return student by id
	@GetMapping("student")
	public ResponseEntity<Optional<Student>> getStudentById(@RequestParam Long id) {

		return ResponseEntity.ok(studentService.getStudentById(id));

	}

	
	// Delete student by id
	@DeleteMapping("student/{id}")
	public void deleteStudentById(@PathVariable Long id) {

		studentService.deleteStudent(id);
	}

	// Create new Student object
	@PostMapping("student")
	public ResponseEntity<Student> createNewStudent(@RequestBody Student newStudent) {
		return ResponseEntity.ok(studentService.createStudent(newStudent));
	}
	
	
	// Update Student college attribute
	@PatchMapping("student")
	public ResponseEntity<String> updateStudentCollege(@RequestBody Student student) {
		return ResponseEntity.ok(studentService.udpateStudentCollege(student) );
	}

}
