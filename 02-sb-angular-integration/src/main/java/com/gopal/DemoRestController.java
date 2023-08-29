package com.gopal;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class DemoRestController {

	@GetMapping("/greet")
	public String getGreetMsg() {
		
		String msg = "Wish you good morning";
		return msg;
	}
	
	
	@GetMapping("/wish")
	public String getWishtMsg() {
		
		String msg = "Wish you good evening";
		return msg;
	}
	
}
