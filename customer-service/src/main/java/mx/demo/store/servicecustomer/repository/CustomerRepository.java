package mx.demo.store.servicecustomer.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import mx.demo.store.servicecustomer.entity.CustomerEntity;
import mx.demo.store.servicecustomer.entity.RegionEntity;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerEntity, Long> {

	public CustomerEntity findByNumberID(String numberID);
	public List<CustomerEntity> findByLastName(String lastName);
	public List<CustomerEntity> findByRegion(RegionEntity regionEntity);
}
