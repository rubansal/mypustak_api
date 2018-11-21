package com.mypustak.mypustak_rest.controller;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<Cities, Integer> {
	List<Cities> findByStateId(int stateId);
}
