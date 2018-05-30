package com.fineframework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {

	@Autowired
	RestTemplate restTemplate;
	
	@RequestMapping("/")
	public String helloConsummer() {
		
		return restTemplate.getForEntity("http://HELLO-SERVICE/", String.class).getBody();
	}
}
