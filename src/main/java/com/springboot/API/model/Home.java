package com.springboot.API.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Home {
	@Id
	private String id;
	private String name;
	private int noOfRoom;
	
}
