package com.br.agenda.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import com.br.agenda.dto.RoomDto;
import com.br.agenda.usecase.RoomUseCase;

@Controller
public class RoomController {

	RoomUseCase useCase;
	
	public List<RoomDto> findAll() {
		return useCase.findAll();
	}

	public ResponseEntity save(RoomDto room) {
		return useCase.save(room);
	}

}
