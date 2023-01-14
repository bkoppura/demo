package io.conektto.ecomapi.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import io.conektto.ecomapi.dto.product.ProductDTO;
import io.conektto.ecomapi.model.Product;
import io.conektto.ecomapi.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

	private ProductService productService;

	public ProductController(ProductService productService) {
		super();
		this.productService = productService;
	}
	
	@PostMapping()
	public ResponseEntity<Product> saveProduct(@RequestBody Product product){
			
		return new ResponseEntity<Product>(productService.saveProduct(product),HttpStatus.CREATED);
	}
	
	@GetMapping("/productlist")
	@ResponseBody
	public ResponseEntity<List<Product>> getAllProducts(){
        List<Product> productList = productService.getAllProducts();
        return new ResponseEntity<List<Product>>(productList, HttpStatus.OK);
	}
	
	@PutMapping(value="/update",consumes= {"application/json"},produces= {"application/json"})
    @ResponseBody
    public ResponseEntity<Product> updateProduct(@RequestBody Product product,UriComponentsBuilder builder){
		Product updatedProduct=productService.updateProduct(product);
    	return new ResponseEntity<Product>(updatedProduct,HttpStatus.CREATED);
    }
	
	@DeleteMapping(value="/delete/{productId}")
	@ResponseBody
	public ResponseEntity<Boolean> deleteProduct(@PathVariable Long productId){
    	Boolean isDeleted=productService.deleteProduct(productId);
    	return new ResponseEntity<Boolean>(isDeleted,HttpStatus.OK);
    }
	
	@GetMapping("/{productId}")
	@ResponseBody
	public ResponseEntity<ProductDTO> getAllProductByID(@PathVariable Long productId){
		ProductDTO product = productService.getProductbyID(productId);
        return new ResponseEntity<ProductDTO>(product, HttpStatus.OK);
	}
	
	@PatchMapping("/update/{productid}")
	public ResponseEntity<Product> patchProduct(@PathVariable long productid, 
	        @RequestBody ProductDTO productDTO)
	{
		
		Product product= productService.getProductEntitybyID(productid);			    
	    
	    
		return new ResponseEntity<Product>(productService.savePatchedProduct(product,productDTO), HttpStatus.OK);
	    	
	    
	}
	
	
}
