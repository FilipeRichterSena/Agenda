package com.br.agenda.rest;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.agenda.controller.UserController;
import com.br.agenda.dto.UserDto;

@RestController
@RequestMapping("/users")
public class UserResource {

	UserController userController;
	
	@GetMapping
	public List<UserDto> getAllUsers() {
		return userController.findAll();
	}

	@PostMapping("/add")
	public ResponseEntity addUser(@RequestBody UserDto user) {
		return userController.save(user);
	}
}
