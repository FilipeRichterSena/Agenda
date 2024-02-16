package com.br.agenda.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import com.br.agenda.dto.UserDto;
import com.br.agenda.usecase.UserUseCase;

@Controller
public class UserController {

	UserUseCase useCase;
	
	public List<UserDto> findAll() {
		return useCase.findAll();
	}
	
	public ResponseEntity save(UserDto user) {
		return useCase.save(user);
	}
}
