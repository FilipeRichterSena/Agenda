package com.br.agenda.usecase;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.br.agenda.dto.ReservationDto;
import com.br.agenda.entity.Reservation;
import com.br.agenda.repository.ReservationRepository;

public class ReservationUseCase {

	ReservationRepository repository;
	
	public ResponseEntity save(ReservationDto reservation) {
		Reservation entity = new Reservation();
		repository.save(entity);
		return ResponseEntity.status(HttpStatus.CREATED).body(entity);
	}

	public List<ReservationDto> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
}