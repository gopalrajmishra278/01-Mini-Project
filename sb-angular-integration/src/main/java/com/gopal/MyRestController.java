package com.gopal;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class MyRestController {
	
	@GetMapping("/welcome")
	public String getWelcomeMsg() {
		
		String msg = "Welcome to FullStack Development";
		return msg;
		
	}
	
	
	@GetMapping("/wish")
	public String getWishMsg() {
		
		String msg = "Hello friends wish you good morning";
		return msg;
	}	
		
	
}
