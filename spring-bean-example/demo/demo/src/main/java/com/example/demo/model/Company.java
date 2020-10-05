package com.example.demo.model;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Component
public class Company {

	private Address address;

	public Company(Address address) {
		this.address = address;
	}

}
