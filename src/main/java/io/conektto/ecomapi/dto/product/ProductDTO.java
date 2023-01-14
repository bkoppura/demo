package io.conektto.ecomapi.dto.product;

import java.math.BigDecimal;
import java.sql.Timestamp;



public class ProductDTO {

	
	private Long ProductID;
	
	private String Name;
	
	private String ProductNumber;	
	
	private String Color;		
	
	private Integer DaysToManufacture;	
		
	private Integer ProductModelID;

	public ProductDTO() {
		super();
	}

	public ProductDTO(Long productID, String name, String productNumber, String color, Integer daysToManufacture,
			Integer productModelID) {
		super();
		ProductID = productID;
		Name = name;
		ProductNumber = productNumber;
		Color = color;
		DaysToManufacture = daysToManufacture;
		ProductModelID = productModelID;
	}

	public Long getProductID() {
		return ProductID;
	}

	public void setProductID(Long productID) {
		ProductID = productID;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getProductNumber() {
		return ProductNumber;
	}

	public void setProductNumber(String productNumber) {
		ProductNumber = productNumber;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public Integer getDaysToManufacture() {
		return DaysToManufacture;
	}

	public void setDaysToManufacture(Integer daysToManufacture) {
		DaysToManufacture = daysToManufacture;
	}

	public Integer getProductModelID() {
		return ProductModelID;
	}

	public void setProductModelID(Integer productModelID) {
		ProductModelID = productModelID;
	}

	
	
	

	
}
