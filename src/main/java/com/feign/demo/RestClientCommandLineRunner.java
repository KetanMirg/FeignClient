package com.feign.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class RestClientCommandLineRunner implements CommandLineRunner {

	@Autowired
	RestClient rest;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("Users:-" +rest.getUserNames());
		
		System.out.println("Ids:-" +rest.getUserIds());
		
	}

}
