package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import enitity.Customer;

public interface CustomerRepository extends JpaRepository <Customer, Integer>{

}
