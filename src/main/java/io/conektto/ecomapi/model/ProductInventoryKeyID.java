package io.conektto.ecomapi.model;
import java.io.Serializable;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;



public class ProductInventoryKeyID implements Serializable{

	
	  private Product product;
	 
	  
	  private Location location;


	public Product getProduct() {
		return product;
	}


	public void setProduct(Product product) {
		this.product = product;
	}


	public Location getLocation() {
		return location;
	}


	public void setLocation(Location location) {
		this.location = location;
	}
	  
	  



	  /*
	public Long getProductID() {
		return ProductID;
	}


	public void setProductID(Long productID) {
		ProductID = productID;
	}


	public Long getLocationID() {
		return LocationID;
	}


	public void setLocationID(Long locationID) {
		LocationID = locationID;
	}
	*/
	  
	  
	  
	
	  
	  
}
