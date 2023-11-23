package com.bookstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookstore.entity.User;
import com.bookstore.service.UserService;
@RestController
public class UserController {
	
	@Autowired
	UserService userService;

	
	
	@RequestMapping("/HI")
	public String home() {
		return "Rest api";
	}

	@PostMapping("/addUser")
	public String addUser(@RequestBody User user) {
		System.out.println("In add User:" + user);
		return userService.addUser(user);
	}

	
	@GetMapping("/getUser/{id}")
	public User getUserData(@PathVariable int id) {
		
		return userService.getUser(id);
	}

	
	
	@PutMapping("/updateUser/{id}")
	public String updateUser(@PathVariable int id, @RequestBody User newUser) {
		return userService.updateUser(id, newUser);
	}

}
