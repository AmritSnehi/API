package com.springboot.API.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.API.model.Home;

public interface HomeRepository extends JpaRepository< Home, String> {

}
