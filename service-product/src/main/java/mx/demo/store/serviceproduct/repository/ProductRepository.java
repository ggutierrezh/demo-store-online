package mx.demo.store.serviceproduct.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mx.demo.store.serviceproduct.entity.CategoryEntity;
import mx.demo.store.serviceproduct.entity.ProductEntity;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Long> {
	
	public List<ProductEntity> findByCategoryEntity(CategoryEntity categoryEntity);
}
