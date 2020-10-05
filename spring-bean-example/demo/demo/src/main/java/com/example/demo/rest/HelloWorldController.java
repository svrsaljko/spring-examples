package com.example.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.configuration.Config;
import com.example.demo.model.Company;

@RestController
public class HelloWorldController {

	void process() {
		ApplicationContext context = null;
		try {
			context = new AnnotationConfigApplicationContext(Config.class);
			Company company = context.getBean("company", Company.class);
			System.out.println("company.getAddress().getStreet() " + company.getAddress().getStreet());
			System.out.println("1000, company.getAddress().getNumber() " + company.getAddress().getNumber());
//			assertEquals("High Street", company.getAddress().getStreet());
//			assertEquals(1000, company.getAddress().getNumber());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@GetMapping("/hello")
	public ResponseEntity<String> hello() {

		return ResponseEntity.ok("Hello world!");

	}

	@GetMapping("/context")
	public void contextBean() {
		this.process();

	}

}
