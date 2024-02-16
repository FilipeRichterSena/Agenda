package com.br.agenda.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.agenda.entity.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long>{

}
