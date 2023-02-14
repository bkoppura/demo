package io.conektto.ecomapi.service;


import io.conektto.ecomapi.model.ProductInventory;
import io.conektto.ecomapi.model.ProductInventoryKeyID;


public interface ProductInventoryService {
	
	
	public ProductInventory saveProductInventory(ProductInventory productInventory); 
	
	public ProductInventory findById(ProductInventoryKeyID id);
	
	public void deleteProductInventory(ProductInventoryKeyID id);
	
}
