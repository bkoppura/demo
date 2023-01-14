package io.conektto.ecomapi.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "[Production].[Location]")
public class Location {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long LocationID;
	
	@Column(name = "Name", nullable = false)
	private String Name;
	
	@Column(name = "CostRate", nullable = false)
	private BigDecimal CostRate;
	
	@Column(name = "Availability", nullable = false)
	private Double Availability;
	
	@Column(name = "ModifiedDate", nullable = false)
	private Timestamp ModifiedDate;

	public Long getLocationID() {
		return LocationID;
	}

	public void setLocationID(Long locationID) {
		LocationID = locationID;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public BigDecimal getCostRate() {
		return CostRate;
	}

	public void setCostRate(BigDecimal costRate) {
		CostRate = costRate;
	}

	public Double getAvailability() {
		return Availability;
	}

	public void setAvailability(Double availability) {
		Availability = availability;
	}

	public Timestamp getModifiedDate() {
		return ModifiedDate;
	}

	public void setModifiedDate(Timestamp modifiedDate) {
		ModifiedDate = modifiedDate;
	}
		

}
