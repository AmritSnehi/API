package com.springboot.API.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.API.model.Home;
import com.springboot.API.service.HomeService;

@RestController
@RequestMapping("/home")
public class HomeController {
	
	@Autowired
	HomeService homeService;
	
	@PostMapping("/")
	void addHome(Home home) {
		homeService.addHome(home);
	}
	
	@GetMapping("/{id}")
	Home viewHome(@PathVariable String id) {
		return homeService.viewHome(id);
	}
}
