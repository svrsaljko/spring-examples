package com.example.demo.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.demo.model.Address;
import com.example.demo.model.Company;

@Configuration
@ComponentScan(basePackageClasses = Company.class)
public class Config {
	@Bean
	public Address getAddress() {
		return new Address("High Street", 1000);
	}
}