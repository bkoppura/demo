package io.conektto.ecomapi.serviceimpl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.conektto.ecomapi.dto.product.ProductDTO;
import io.conektto.ecomapi.exception.ProductException;
import io.conektto.ecomapi.model.Product;
import io.conektto.ecomapi.repository.ProductListQueryRepository;
import io.conektto.ecomapi.repository.ProductRepository;
import io.conektto.ecomapi.service.ProductService;
import io.conektto.ecomapi.util.Constents;

@Service
public class ProductServiceImpl implements ProductService{

	private ProductRepository productRepository;

	@Autowired
	ProductListQueryRepository productListQueryRepository;
	
	public ProductServiceImpl(ProductRepository productRepository) {
		super();
		this.productRepository = productRepository;
	}

	@Override
	public Product saveProduct(Product product) {
		return productRepository.save(product);
	}

	@Override
	public List<Product> getAllProducts() {
		return productRepository.findAll();
	}

	@Override
	public Product updateProduct(Product product) {
		Optional<Product> opt_product = productRepository.findById(product.getProductID());
		Product productTemp = null;
		if (opt_product.isPresent()) {
			Product actual = opt_product.get();
			//actual.setName(location.getName());
			actual.setClass1(product.getClass1());
			actual.setColor(product.getColor());
			actual.setDaysToManufacture(product.getDaysToManufacture());
			actual.setDiscontinuedDate(product.getDiscontinuedDate());
			actual.setFinishedGoodsFlag(product.getFinishedGoodsFlag());
			actual.setListPrice(product.getListPrice());
			actual.setMakeFlag(product.getMakeFlag());
			actual.setModifiedDate(product.getModifiedDate());
			actual.setName(product.getName());
			actual.setProductLine(product.getProductLine());
			actual.setProductModelID(product.getProductModelID());
			actual.setProductNumber(product.getProductNumber());
			actual.setProductSubcategoryID(product.getProductSubcategoryID());
			actual.setReorderPoint(product.getReorderPoint());
			actual.setRowguid(product.getRowguid());
			actual.setSafetyStockLevel(product.getSafetyStockLevel());
			actual.setSellEndDate(product.getSellEndDate());
			actual.setSellStartDate(product.getSellStartDate());
			actual.setSize(product.getSize());
			actual.setSizeUnitMeasureCode(product.getSizeUnitMeasureCode());
			actual.setStandardCost(product.getStandardCost());
			actual.setStyle(product.getStyle());
			actual.setWeight(product.getWeight());
			actual.setWeightUnitMeasureCode(product.getWeightUnitMeasureCode());
			productTemp = productRepository.save(actual);
		} else {
			throw new ProductException(Constents.PRODUCT_NOT_FOUND);

		}
		return productTemp;
	}

	@Override
	public Boolean deleteProduct(Long productId) {
		Optional<Product> opt_product = productRepository.findById(productId);
		if (opt_product.isPresent()) {
			productRepository.delete(opt_product.get());
		} else {
			throw new ProductException(Constents.PRODUCT_NOT_FOUND);
		}
		return Boolean.TRUE;
	}

	@Override
	public ProductDTO getProductbyID(long productId) {
		
			List<ProductDTO> queriedProduct = productListQueryRepository.getProductByID(productId).stream().map(e->{
			ProductDTO product =new ProductDTO();
			product.setProductID(e.getProductID());
			product.setName(e.getName());
			product.setProductNumber(e.getProductNumber());
			product.setColor(e.getColor());
			product.setDaysToManufacture(e.getDaysToManufacture());
			product.setProductModelID(e.getProductModelID());
			return product;
			}).collect(Collectors.toList())			;
		
		
		return queriedProduct.get(0);
	}

	@Override
	public Product getProductEntitybyID(long productid) {

		Product product=productRepository.findById(productid).orElseThrow(ProductException::new);
		
		return product;
		
	}

	@Override
	public Product savePatchedProduct(Product product, ProductDTO productDTO) {
		// TODO Auto-generated method stub
		//product.setProductID(productDTO.getProductID());
		product.setName(productDTO.getName());
		product.setProductNumber(productDTO.getProductNumber());
		product.setColor(productDTO.getColor());
		product.setDaysToManufacture(productDTO.getDaysToManufacture());
		product.setProductModelID(productDTO.getProductModelID());
		
		return productRepository.save(product);
		
	}

	
	
	
	
}
