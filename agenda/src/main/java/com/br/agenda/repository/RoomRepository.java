package com.br.agenda.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.agenda.entity.Room;

public interface RoomRepository extends JpaRepository<Room, Long>{

}
