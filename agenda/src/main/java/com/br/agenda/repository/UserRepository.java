package com.br.agenda.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.agenda.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
