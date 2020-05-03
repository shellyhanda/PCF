package com.hcl.pcf.springbootpcf.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping("/hello")
	public String Hello() {
		return "Hello Shelly in 2019";
	}
}
