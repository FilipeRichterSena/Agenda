package com.br.agenda.usecase;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.br.agenda.dto.UserDto;
import com.br.agenda.entity.User;
import com.br.agenda.repository.RoomRepository;
import com.br.agenda.repository.UserRepository;

public class UserUseCase {

	UserRepository repository;
	
	public ResponseEntity save(UserDto user) {
		User entity = new User();
		repository.save(entity);
		return ResponseEntity.status(HttpStatus.CREATED).body(entity);
	}

	public List<UserDto> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
}
