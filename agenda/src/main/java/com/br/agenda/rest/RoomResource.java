package com.br.agenda.rest;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.agenda.controller.RoomController;
import com.br.agenda.dto.RoomDto;

@RestController
@RequestMapping("/rooms")
public class RoomResource {

	RoomController roomController;
	
	@GetMapping
	public List<RoomDto> getAllRooms() {
		return roomController.findAll();
	}

	@PostMapping("/add")
	public ResponseEntity addRoom(@RequestBody RoomDto room) {
		return roomController.save(room);
	}
}
