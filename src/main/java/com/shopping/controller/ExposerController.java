package com.shopping.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExposerController {
	
	@GetMapping("/update/{balance}")
	public String updateBalance(@PathVariable int balance) {
		return "updated balance is "+balance;
	}

}
