package com.br.agenda.usecase;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.br.agenda.dto.RoomDto;
import com.br.agenda.entity.Room;
import com.br.agenda.repository.RoomRepository;

public class RoomUseCase {

	RoomRepository repository;
	
	public ResponseEntity save(RoomDto room) {
		Room entity = new Room();
		repository.save(entity);
		return ResponseEntity.status(HttpStatus.CREATED).body(entity);
	}

	public List<RoomDto> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
