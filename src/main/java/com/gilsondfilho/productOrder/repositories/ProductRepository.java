package com.gilsondfilho.productOrder.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gilsondfilho.productOrder.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
