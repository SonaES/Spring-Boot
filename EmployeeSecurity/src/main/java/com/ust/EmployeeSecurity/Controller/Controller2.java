package com.ust.EmployeeSecurity.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



	@RestController
	@RequestMapping("/user/info")

	public class Controller2 {
		@GetMapping("/goodmorning")
		
		public String greeting() {
			return "hi sona good morning";
		}

	}


