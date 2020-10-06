package com.example.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.config.YAMLConfig;
import com.example.demo.config.YAMLConfigProd;

@RestController
public class HelloController {

	@Autowired
	YAMLConfig yaml;
	
	@Autowired
	YAMLConfigProd yamlProd;

	@GetMapping("/")
	public String name() {
		return yaml.getName();
	}
	@GetMapping("/prod")
	public String nameProd() {
		return yamlProd.getName();
	}

}
