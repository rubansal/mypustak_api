package com.mypustak.mypustak_rest.controller;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Integer> {
	Users findUsersByEmail(String email);
	Users findTopByOrderByIdDesc();
}
