package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.HomeService;

@RestController
@RequestMapping("/home")
public class HomeController {

	@Autowired
	private HomeService homeService;
	
	@GetMapping("/index")
	public String index() {
		return homeService.callingGraphQL();
	}
}
