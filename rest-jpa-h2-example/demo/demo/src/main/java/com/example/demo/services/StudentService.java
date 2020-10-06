package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.StudentRepository;
import com.example.demo.interfaces.StudentServiceInterface;
import com.example.demo.model.Student;

@Service
public class StudentService implements StudentServiceInterface {

	@Autowired
	StudentRepository studentRepository;

	@Override
	public List<Student> getAllStudents() {

		return studentRepository.findAll();

	}

	@Override
	public Optional<Student> getStudentById(Long id) {

		return studentRepository.findById(id);

	}
	

	@Override
	public void deleteStudent(Long id) {

//		studentRepository.delete(student);
		studentRepository.deleteById(id);

	}
	
	
	@Override
	public Student createStudent(Student student) {
		return studentRepository.save(student);
	}
	
	
	@Override
	public String udpateStudentCollege(Student student) {
		String message = "New student college submitted successfully";
		
		if( studentRepository.existsById(student.getId())) {
			
			studentRepository.save(student);
			
		}else {
			message="Student not found!";
		}
		   
		return message;
		
	}
	
	
	
	
	

}
