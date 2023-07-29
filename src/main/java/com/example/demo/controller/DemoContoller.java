package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoContoller {
	
	@GetMapping(path = "/hit"/* ,produces = "application/json" */)
	public String abcd() {
		
		return "hi this for demo";
		
	}

}
