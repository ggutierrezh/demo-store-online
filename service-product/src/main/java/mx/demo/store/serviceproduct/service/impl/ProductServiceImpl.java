package mx.demo.store.serviceproduct.service.impl;

import java.util.Date;
import java.util.List;
import org.springframework.stereotype.Service;
import lombok.AllArgsConstructor;
import mx.demo.store.serviceproduct.entity.CategoryEntity;
import mx.demo.store.serviceproduct.entity.ProductEntity;
import mx.demo.store.serviceproduct.repository.ProductRepository;
import mx.demo.store.serviceproduct.service.ProductService;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {
	
	private ProductRepository productRepository;

	@Override
	public List<ProductEntity> listAllProduct() {
		return productRepository.findAll();
	}

	@Override
	public ProductEntity getProduct(Long id) {
		return productRepository.findById(id).orElse(null);
	}

	@Override
	public ProductEntity createProduct(ProductEntity productEntity) {
		productEntity.setStatus("CREATED");
		productEntity.setCreateAt(new Date());
		return productRepository.save(productEntity);
	}

	@Override
	public ProductEntity updateProduct(ProductEntity productEntity) {
		ProductEntity productFinded = getProduct(productEntity.getId());
		
		if(productFinded == null) {
			return null;
		}
		
		productEntity.setId(productFinded.getId());
		
		return productRepository.save(productEntity);
	}

	@Override
	public ProductEntity deleteProduct(Long id) {
		ProductEntity productFinded = getProduct(id);
		
		if(productFinded == null) {
			return null;
		}
		productFinded.setStatus("DELETED");	
		return productRepository.save(productFinded);
	}

	@Override
	public List<ProductEntity> findByCategory(CategoryEntity categoryEntity) {
		return productRepository.findByCategory(categoryEntity);
	}

	@Override
	public ProductEntity updateStock(Long id, Double quantity) {
		ProductEntity productFinded = getProduct(id);
		
		if(productFinded == null) {
			return null;
		}
		
		productFinded.setStock(productFinded.getStock() + quantity);
		
		return productRepository.save(productFinded);
	}

}
