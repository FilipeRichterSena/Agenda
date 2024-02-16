package com.br.agenda.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.br.agenda.dto.UserDto;

@Entity
public class Room {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private LocalDateTime startTime;

	private LocalDateTime endTime;

//	@OneToOne
//	private User user;
//
//	@OneToOne
//	private Room room;
}