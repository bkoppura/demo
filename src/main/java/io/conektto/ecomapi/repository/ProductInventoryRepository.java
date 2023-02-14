package io.conektto.ecomapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.conektto.ecomapi.model.ProductInventory;

import io.conektto.ecomapi.model.ProductInventoryKeyID;

public interface ProductInventoryRepository extends JpaRepository<ProductInventory,ProductInventoryKeyID>{

	
}
