package com.educationit.spring.beginningclass03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class BeginningClass031Application {

	@RequestMapping("/")
	@ResponseBody
	public String home() {
		return "Hello world";
	}

	public static void main(String[] args) {
		SpringApplication.run(BeginningClass031Application.class, args);
	}

}
