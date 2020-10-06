package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


/*
 * Student class provides student model
 * */
@Getter
@Setter
@ToString
@Entity
@Table(name = "students")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	Long id;

	@Column(name = "first_name")
	String name;

	@Column(name = "last_name")
	String lastName;

	@Column(name = "college")
	String college;

	public Student() {
	}

//	public Student(Long id, String name, String lastName, String college) {
//		this.id = id;
//		this.name = name;
//		this.lastName = lastName;
//		this.college = college;
//	}

}
