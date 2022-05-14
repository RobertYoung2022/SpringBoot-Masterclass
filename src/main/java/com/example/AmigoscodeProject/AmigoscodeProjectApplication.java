package com.example.AmigoscodeProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class AmigoscodeProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(AmigoscodeProjectApplication.class, args);
	}

	@GetMapping
	@ResponseBody
	public String name() {
		return "My name is Robert";
	}
}
