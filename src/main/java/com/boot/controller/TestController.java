package com.boot.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class TestController {

	@RequestMapping("/api")
	public String ApiTest(){
		return "{\"name\":\"moulton\"}";
	}
}