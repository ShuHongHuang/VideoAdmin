package com.imooc.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.imooc.pojo.Users;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {
	
	@RequestMapping("/hello")
	public String Hello() {
		return "Hello Spring Boot~";
	}
	
	@PostMapping("/hey")
	public String h1(String username1,String password1) {
		return "username:" + username1 + "password:" + password1;
	}
	
	@GetMapping("/hey/{id}")
	public String h2(@PathVariable("id")Integer id) {
		return "id:" + id.toString();
	}
	
	@DeleteMapping("/hey/{id}")
	public String h3(@PathVariable("id")Integer id) {
		return "id1:" + id.toString();
	} 
	
	@PutMapping("/hey")
	public String h4(@PathVariable("id")Integer id,
			@RequestParam("username")String username,@RequestParam("password")String password) {
		return "username:" + username + "password:" + password;
	}
	
	@PostMapping("/hey1")
	public String h5(@RequestBody Users user) {
		
		return user.getUsername();
	}
}
