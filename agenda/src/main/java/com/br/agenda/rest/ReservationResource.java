package com.br.agenda.rest;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.agenda.controller.ReservationController;
import com.br.agenda.dto.ReservationDto;

@RestController
@RequestMapping("/reservations")
public class ReservationResource {

	ReservationController reservationController;
	
	@GetMapping
	public List<ReservationDto> getAllReservations() {
		return reservationController.findAll();
	}

	@PostMapping("/add")
	public ResponseEntity addReservation(@RequestBody ReservationDto reservation) {
		return reservationController.save(reservation);
	}
}