package com.example.demojenkins;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class myresource {
	
	@RequestMapping("/")
	public String message() {
		return "hello, this is demo fron spring boot project with jenkins";
	}
}
