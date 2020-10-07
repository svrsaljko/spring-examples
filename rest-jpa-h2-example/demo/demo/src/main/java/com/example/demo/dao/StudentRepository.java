package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Student;

/*
 * Jpa Repository interface provides methods for CRUD operations in database
 * for StudentRepository class
 * */
public interface StudentRepository extends JpaRepository<Student, Long> {

}
