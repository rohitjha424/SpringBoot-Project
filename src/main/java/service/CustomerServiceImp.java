package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import enitity.Customer;
import repository.CustomerRepository;

@Service
public class CustomerServiceImp implements CustomerService{

	@Autowired
	private CustomerRepository customerRepository;

	
	@Override
	public Customer placeOrder(Customer customer) {
		
		return customerRepository.save(customer);
	}


	public CustomerServiceImp(CustomerRepository customerRepository) {
		super();
		this.customerRepository = customerRepository;
	}
	

}
