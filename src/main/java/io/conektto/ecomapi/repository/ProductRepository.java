package io.conektto.ecomapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.conektto.ecomapi.model.Product;

public interface ProductRepository extends JpaRepository<Product,Long>{

	
}
