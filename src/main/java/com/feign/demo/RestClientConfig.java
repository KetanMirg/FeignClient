package com.feign.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import feign.Contract;

@Configuration
public class RestClientConfig {
	
	  @Bean
	    public Contract feignContract() {
	        return new feign.Contract.Default();
	    }
	
	

}
