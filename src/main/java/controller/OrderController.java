package controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import dto.OrderRequest;
import enitity.Customer;
import repository.CustomerRepository;
import repository.ProductRepository;
import service.CustomerService;

@RestController
public class OrderController {
	
	@Autowired
	private CustomerService customerService;
	
	
	@PostMapping("/placeorder")
	public Customer placeOrder(@RequestBody Customer customer ) {
		
		return customerService.placeOrder(customer);	
	}
	
//	 @Autowired
//	    private CustomerRepository customerRepository;
//	 
//	    @Autowired
//	    private ProductRepository productRepository;
//
//	    @PostMapping("/placeOrder")
//	    public Customer placeOrder(@RequestBody OrderRequest request){
//	       return customerRepository.save(request.getCustomer());
//	    }
//
//	    @GetMapping("/findAllOrders")
//	    public List<Customer> findAllOrders(){
//	        return customerRepository.findAll();
//	    }
//
//	    @GetMapping("/getInfo")
//	    public List<OrderResponse> getJoinInformation(){
//	        return customerRepository.getJoinInformation();
//	    }

}
