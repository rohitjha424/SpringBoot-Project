package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import enitity.Product;



public interface ProductRepository extends JpaRepository <Product, Integer>{
	

}
