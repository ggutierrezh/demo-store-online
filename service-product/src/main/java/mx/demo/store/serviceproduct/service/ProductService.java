package mx.demo.store.serviceproduct.service;

import java.util.List;
import mx.demo.store.serviceproduct.entity.CategoryEntity;
import mx.demo.store.serviceproduct.entity.ProductEntity;

public interface ProductService {
	
	public List<ProductEntity> listAllProduct();
	public ProductEntity getProduct(Long id);
	public ProductEntity createProduct(ProductEntity productEntity);
	public ProductEntity updateProduct(ProductEntity productEntity);
	public ProductEntity deleteProduct(Long id);
	public List<ProductEntity> findByCategory(CategoryEntity categoryEntity);
	public ProductEntity updateStock(Long id, Double quantity);
}
