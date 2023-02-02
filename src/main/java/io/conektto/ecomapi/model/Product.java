package io.conektto.ecomapi.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.Id;

@Entity
@Table(name = "[Production].[Product]")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ProductID;
	
	@Column(name = "Name")
	private String Name;
	
	@Column(name = "ProductNumber")
	private String ProductNumber;
	
	@Column(name = "MakeFlag")
	private Byte MakeFlag;
	
	@Column(name = "FinishedGoodsFlag")
	private Byte FinishedGoodsFlag;
	
	@Column(name = "Color")
	private String Color;
	
	@Column(name = "SafetyStockLevel")
	private Short SafetyStockLevel;
	
	@Column(name = "ReorderPoint")
	private Short ReorderPoint;
	
	@Column(name = "StandardCost")
	private Double StandardCost;
	
	@Column(name = "ListPrice")
	private Double ListPrice;
	
	@Column(name = "Size")
	private String Size;
	
	@Column(name = "SizeUnitMeasureCode", nullable = true)
	private String SizeUnitMeasureCode;
	
	@Column(name = "WeightUnitMeasureCode", nullable = true)
	private String WeightUnitMeasureCode;
	
	@Column(name = "Weight", nullable = true)
	private Double Weight;
	
	@Column(name = "DaysToManufacture")
	private Integer DaysToManufacture;
	
	@Column(name = "ProductLine", nullable = true)
	private String ProductLine;
	
	@Column(name = "Class", nullable = true)
	private String Class1;
	
	@Column(name = "Style", nullable = true)
	private String Style;
	
	@Column(name = "ProductSubcategoryID", nullable = true)
	private Integer ProductSubcategoryID;
	
	@Column(name = "ProductModelID")
	private Integer ProductModelID;
	
	@Column(name = "SellStartDate")
	private Timestamp  SellStartDate;
	
	@Column(name = "SellEndDate", nullable = true)
	private Timestamp SellEndDate;
	
	@Column(name = "DiscontinuedDate", nullable = true)
	private Timestamp DiscontinuedDate;
	
	@Column(name = "rowguid")
	private UUID rowguid;
	
	@Column(name = "ModifiedDate")
	private Timestamp ModifiedDate;

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

	public Byte getMakeFlag() {
		return MakeFlag;
	}

	public void setMakeFlag(Byte makeFlag) {
		MakeFlag = makeFlag;
	}

	public Byte getFinishedGoodsFlag() {
		return FinishedGoodsFlag;
	}

	public void setFinishedGoodsFlag(Byte finishedGoodsFlag) {
		FinishedGoodsFlag = finishedGoodsFlag;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public Short getSafetyStockLevel() {
		return SafetyStockLevel;
	}

	public void setSafetyStockLevel(Short safetyStockLevel) {
		SafetyStockLevel = safetyStockLevel;
	}

	public Short getReorderPoint() {
		return ReorderPoint;
	}

	public void setReorderPoint(Short reorderPoint) {
		ReorderPoint = reorderPoint;
	}

	public Double getStandardCost() {
		return StandardCost;
	}

	public void setStandardCost(Double standardCost) {
		StandardCost = standardCost;
	}

	public Double getListPrice() {
		return ListPrice;
	}

	public void setListPrice(Double listPrice) {
		ListPrice = listPrice;
	}

	public String getSize() {
		return Size;
	}

	public void setSize(String size) {
		Size = size;
	}

	public String getSizeUnitMeasureCode() {
		return SizeUnitMeasureCode;
	}

	public void setSizeUnitMeasureCode(String sizeUnitMeasureCode) {
		SizeUnitMeasureCode = sizeUnitMeasureCode;
	}

	public String getWeightUnitMeasureCode() {
		return WeightUnitMeasureCode;
	}

	public void setWeightUnitMeasureCode(String weightUnitMeasureCode) {
		WeightUnitMeasureCode = weightUnitMeasureCode;
	}

	public Double getWeight() {
		return Weight;
	}

	public void setWeight(Double weight) {
		Weight = weight;
	}

	public Integer getDaysToManufacture() {
		return DaysToManufacture;
	}

	public void setDaysToManufacture(Integer daysToManufacture) {
		DaysToManufacture = daysToManufacture;
	}

	public String getProductLine() {
		return ProductLine;
	}

	public void setProductLine(String productLine) {
		ProductLine = productLine;
	}

	public String getClass1() {
		return Class1;
	}

	public void setClass1(String class1) {
		Class1 = class1;
	}

	public String getStyle() {
		return Style;
	}

	public void setStyle(String style) {
		Style = style;
	}

	public Integer getProductSubcategoryID() {
		return ProductSubcategoryID;
	}

	public void setProductSubcategoryID(Integer productSubcategoryID) {
		ProductSubcategoryID = productSubcategoryID;
	}

	public Integer getProductModelID() {
		return ProductModelID;
	}

	public void setProductModelID(Integer productModelID) {
		ProductModelID = productModelID;
	}

	public Timestamp getSellStartDate() {
		return SellStartDate;
	}

	public void setSellStartDate(Timestamp sellStartDate) {
		SellStartDate = sellStartDate;
	}

	public Timestamp getSellEndDate() {
		return SellEndDate;
	}

	public void setSellEndDate(Timestamp sellEndDate) {
		SellEndDate = sellEndDate;
	}

	public Timestamp getDiscontinuedDate() {
		return DiscontinuedDate;
	}

	public void setDiscontinuedDate(Timestamp discontinuedDate) {
		DiscontinuedDate = discontinuedDate;
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
