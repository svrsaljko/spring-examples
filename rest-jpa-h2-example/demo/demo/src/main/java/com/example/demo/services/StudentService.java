package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.StudentRepository;
import com.example.demo.interfaces.StudentServiceInterface;
import com.example.demo.model.Student;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;

/*
 * Student service class implements StudentService interface
 * */
@Service
public class StudentService implements StudentServiceInterface {

	@Autowired
	StudentRepository studentRepository;

	@Autowired
	MeterRegistry meterRegistry;

	Counter createStudentCounter;

	@PostConstruct
	void init() {
		createStudentCounter = Counter.builder("student.create.counter").register(meterRegistry);
	}

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
		createStudentCounter.increment();
		return studentRepository.save(student);
	}

	@Override
	public String udpateStudentCollege(Student student) {
		String message = "New student college submitted successfully";

		if (studentRepository.existsById(student.getId())) {

			studentRepository.save(student);

		} else {
			message = "Student not found!";
		}

		return message;

	}

}
