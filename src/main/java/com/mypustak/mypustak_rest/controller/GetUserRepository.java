package com.mypustak.mypustak_rest.controller;

import org.springframework.data.jpa.repository.JpaRepository;

public interface GetUserRepository extends JpaRepository<GetUserRequest, Integer>{

}
