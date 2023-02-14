package io.conektto.ecomapi.serviceimpl;

import org.springframework.stereotype.Service;

import io.conektto.ecomapi.model.ProductInventory;
import io.conektto.ecomapi.model.ProductInventoryKeyID;
import io.conektto.ecomapi.repository.ProductInventoryRepository;
import io.conektto.ecomapi.service.ProductInventoryService;

@Service
public class ProductInventoryServiceImpl implements ProductInventoryService {

	
    private ProductInventoryRepository productInventoryRepository;
	
    
	
	public ProductInventoryServiceImpl(ProductInventoryRepository productInventoryRepository) {
		super();
		this.productInventoryRepository = productInventoryRepository;
	}

	@Override
	public ProductInventory saveProductInventory(ProductInventory productInventory) {
		return productInventoryRepository.save(productInventory);
	}

	@Override
	public ProductInventory findById(ProductInventoryKeyID id) {
		return productInventoryRepository.findById(id).orElse(null);
	}

	@Override
	public void deleteProductInventory(ProductInventoryKeyID id) {
		productInventoryRepository.deleteById(id);
	}

	
	
}
