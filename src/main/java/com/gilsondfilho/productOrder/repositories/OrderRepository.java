package com.gilsondfilho.productOrder.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gilsondfilho.productOrder.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

	
}
