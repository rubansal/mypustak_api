package com.mypustak.mypustak_rest.controller;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface DonationRequestsRepository extends JpaRepository<DonationRequest, Integer> {
	DonationRequest findTopByOrderByIdDesc();
}
