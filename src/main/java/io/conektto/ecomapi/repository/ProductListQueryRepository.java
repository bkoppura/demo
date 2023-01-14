package io.conektto.ecomapi.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import io.conektto.ecomapi.model.Product;

public interface ProductListQueryRepository extends JpaRepository<Product, Long>   {

	@Query(value="SELECT pt.ProductID , pt.Name , pt.ProductNumber ,pt.Color , pt.DaysToManufacture, pt.ProductModelID from [Production].[Product] pt where pt.ProductID=?1", nativeQuery=true)
	List<Query_Based_Product_List> getProductByID(long ProductID);
	
	public interface Query_Based_Product_List{
		
		Long getProductID();
		
		String getName();
		
		String getProductNumber();	
		
		String getColor();		
		
		Integer getDaysToManufacture();	
			
		Integer getProductModelID();
		
	}
}
