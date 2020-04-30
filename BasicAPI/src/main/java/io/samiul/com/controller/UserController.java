package io.samiul.com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.samiul.com.model.UserModel;
import io.samiul.com.service.UserService;

@RestController
public class UserController {
	@Autowired
	UserService service;
	
	@GetMapping("/showAll")
	public List<UserModel> AllUser(){
		return service.showAll();
	}
	
	@PostMapping("/createUser")
	public String  createUser(@RequestBody UserModel Um) {
		return service.create(Um);
	}
	
	@PutMapping("/updateUser")
	public UserModel updateUser(@RequestBody UserModel um) {
		return service.update(um);
	}
	
	@DeleteMapping("/deleteUser/{i}")
	public String deleteUser(@PathVariable int i) {
		return service.delete(i);
	}
	
	@GetMapping("/searchUser/{i}")
	public UserModel searchUser(@PathVariable int i) {
		return service.search(i);
	}
	
}
