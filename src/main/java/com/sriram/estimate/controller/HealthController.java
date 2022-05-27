package com.sriram.estimate.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController		
public class HealthController {

	@GetMapping("/healthCheck")
	public ResponseEntity<String> healthCheck(){
		return new ResponseEntity<String>("Server is up", HttpStatus.OK);
	}
}
