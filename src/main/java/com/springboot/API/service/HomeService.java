package com.springboot.API.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.API.model.Home;
import com.springboot.API.repository.HomeRepository;

@Service
public class HomeService {
	
	@Autowired
	HomeRepository homeRepository;
	
	public void addHome(Home home) {
		 homeRepository.save(home);
		 
	}

	public Home viewHome(String id)
	{
		return homeRepository.findById(id).get();
	}
}
