package dto;

import org.springframework.beans.factory.annotation.Autowired;

import enitity.Customer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import repository.CustomerRepository;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OrderRequest {

	  private Customer customer;
	  
	  public Customer getCustomer() {
			return customer;
		}

		public void setCustomer(Customer customer) {
			this.customer = customer;
		}

	  public OrderRequest() {
		  
	  }
	public OrderRequest(Customer customer) {
		super();
		this.customer = customer;
	}
	
	
@Override
	public String toString() {
		return "OrderRequest [customer=" + customer + "]";
	}
	
	
	//	@Autowired
//  private CustomerRepository customerRepository;

//	public Customer getCustomer(OrderRequest request) {
//		
//		
//		return customerRepository.save(request.getCustomer(request));
//		
//	}
	  
	  
}
