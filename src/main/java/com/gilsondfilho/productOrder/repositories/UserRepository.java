package com.gilsondfilho.productOrder.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gilsondfilho.productOrder.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	
}
