package com.mypustak.mypustak_rest.controller;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<States, Integer> {
	States findByStateName(String stateName);
}
