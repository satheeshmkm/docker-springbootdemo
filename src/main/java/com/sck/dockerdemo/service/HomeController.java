package com.sck.dockerdemo.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/home")
public class HomeController {
	
	@GetMapping("/hello")
	public String hello() {
		return "hello service called : v2";
	}

}
