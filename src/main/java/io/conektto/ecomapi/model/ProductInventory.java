package io.conektto.ecomapi.model;

import java.sql.Timestamp;
import java.util.UUID;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "[Production].[ProductInventory]")
@IdClass(ProductInventoryKeyID.class)
public class ProductInventory {
	
	
	  @Id
	  @ManyToOne(fetch = FetchType.LAZY, optional = false)
	  @JoinColumn(name = "ProductID", referencedColumnName="ProductID", nullable = false)
	  private Product product;
	  
	  @Id
	  @ManyToOne(fetch = FetchType.LAZY, optional = false)
	  @JoinColumn(name = "LocationID",  referencedColumnName="LocationID", nullable = false)
	  private Location location;
	  
	  
	  
	  @Column(name = "Shelf")
	  private String Shelf;
	  
	  @Column(name = "Bin")
	  private Integer Bin;
	  

	  @Column(name = "Quantity")
	  private Integer Quantity;
	  
	  @Column(name = "rowguid")
	  private UUID rowguid;
	  
	  @Column(name = "ModifiedDate", nullable = false)
	  private Timestamp ModifiedDate;

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

	public String getShelf() {
		return Shelf;
	}

	public void setShelf(String shelf) {
		Shelf = shelf;
	}

	public Integer getBin() {
		return Bin;
	}

	public void setBin(Integer bin) {
		Bin = bin;
	}

	public Integer getQuantity() {
		return Quantity;
	}

	public void setQuantity(Integer quantity) {
		Quantity = quantity;
	}

	public UUID getRowguid() {
		return rowguid;
	}

	public void setRowguid(UUID rowguid) {
		this.rowguid = rowguid;
	}

	public Timestamp getModifiedDate() {
		return ModifiedDate;
	}

	public void setModifiedDate(Timestamp modifiedDate) {
		ModifiedDate = modifiedDate;
	}



	

}
