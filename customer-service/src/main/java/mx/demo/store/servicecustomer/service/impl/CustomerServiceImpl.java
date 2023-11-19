package mx.demo.store.servicecustomer.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import lombok.AllArgsConstructor;
import mx.demo.store.servicecustomer.entity.CustomerEntity;
import mx.demo.store.servicecustomer.repository.CustomerRepository;
import mx.demo.store.servicecustomer.service.CustomerService;

@Service
@AllArgsConstructor
public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customerRepository;
	
	@Override
	public List<CustomerEntity> findCustomerAll(){
		return customerRepository.findAll();
	}	
}
