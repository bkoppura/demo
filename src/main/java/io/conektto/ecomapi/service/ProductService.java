package io.conektto.ecomapi.service;

import java.util.List;

import io.conektto.ecomapi.dto.product.ProductDTO;
import io.conektto.ecomapi.model.Product;

public interface ProductService {

	public Product saveProduct(Product product);

	public List<Product> getAllProducts();

	public Product updateProduct(Product product);

	public Boolean deleteProduct(Long productId);
	
	public ProductDTO getProductbyID(long productId);

	public Product getProductEntitybyID(long productid);

	public Product savePatchedProduct(Product product, ProductDTO productDTO);
	
}
