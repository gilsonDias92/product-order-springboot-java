package com.gilsondfilho.productOrder.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gilsondfilho.productOrder.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
