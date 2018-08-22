package com.feign.demo;

import org.springframework.cloud.openfeign.FeignClient;

import feign.RequestLine;

@FeignClient(name="restclient",url="localhost:8090/users",configuration=RestClientConfig.class)
public interface RestClient {
	
	@RequestLine("GET /getusernames")
	public String getUserNames();
	
	
	@RequestLine("GET /getuserids")
	public String getUserIds();

}
