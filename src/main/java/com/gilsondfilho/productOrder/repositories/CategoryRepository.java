package com.gilsondfilho.productOrder.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gilsondfilho.productOrder.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

	
}
