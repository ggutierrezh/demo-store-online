package mx.demo.store.servicecustomer.service;

import java.util.List;
import mx.demo.store.servicecustomer.entity.CustomerEntity;

public interface CustomerService {

	public List<CustomerEntity> findCustomerAll();
}
