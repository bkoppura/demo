package io.conektto.ecomapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.conektto.ecomapi.service.LocationService;
import io.conektto.ecomapi.service.ProductInventoryService;
import io.conektto.ecomapi.service.ProductService;
import io.conektto.ecomapi.model.ProductInventory;
import io.conektto.ecomapi.model.ProductInventoryKeyID;

@RestController
@RequestMapping("/productinventory")
public class ProductInventoryController {

	
	private ProductInventoryService productInventoryService;
	
	@Autowired
	private ProductService productService;

	@Autowired
	private LocationService locationService;


	public ProductInventoryController(ProductInventoryService productInventoryService) {
		super();
		this.productInventoryService = productInventoryService;
	}
	
	@PostMapping
    public ProductInventory saveProductInventory(@RequestBody ProductInventory productInventory) {
        return productInventoryService.saveProductInventory(productInventory);
    }

    @GetMapping("/{productID}/{locationID}")
    public ProductInventory findById(@PathVariable Long productID, @PathVariable Long locationID) {
    	ProductInventoryKeyID id = new ProductInventoryKeyID();
        id.setProduct(productService.getProductEntitybyID(productID));
        id.setLocation(locationService.getLocationByID(locationID));
        return productInventoryService.findById(id);
    }

    @DeleteMapping("/{productID}/{locationID}")
    public void deleteProductInventory(@PathVariable Long productID, @PathVariable Long locationID) {
    	ProductInventoryKeyID id = new ProductInventoryKeyID();
    	id.setProduct(productService.getProductEntitybyID(productID));
        id.setLocation(locationService.getLocationByID(locationID));
        productInventoryService.deleteProductInventory(id);
    }

    @PatchMapping("/{productID}/{locationID}")
    public ProductInventory update(@PathVariable Long productID, @PathVariable Long locationID, @RequestBody ProductInventory productInventory) {
    	//ProductInventoryKeyID id = new ProductInventoryKeyID();
    	productInventory.setProduct(productService.getProductEntitybyID(productID));
    	productInventory.setLocation(locationService.getLocationByID(locationID));	
    	  	
        return productInventoryService.saveProductInventory(productInventory);
    }


	
}
