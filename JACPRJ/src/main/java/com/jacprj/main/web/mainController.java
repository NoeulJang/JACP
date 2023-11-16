package com.jacprj.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class mainController {
 
	@GetMapping("/")
	public String index() {
		System.out.println("aaaa");
		return "index.html";
	}
}
