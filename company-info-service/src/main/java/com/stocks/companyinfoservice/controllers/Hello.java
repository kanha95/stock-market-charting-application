package com.stocks.companyinfoservice.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

	@RequestMapping("/")
	public String sayHi() {
		return "Hi";
	}
}
