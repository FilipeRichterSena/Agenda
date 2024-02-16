package com.br.agenda.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.br.agenda.dto.ReservationDto;
import com.br.agenda.usecase.ReservationUseCase;

public class ReservationController {
	
	ReservationUseCase useCase;
	
	public List<ReservationDto> findAll() {
		return useCase.findAll();
	}

	public ResponseEntity save(ReservationDto reservation) {
		return useCase.save(reservation);
	}
}