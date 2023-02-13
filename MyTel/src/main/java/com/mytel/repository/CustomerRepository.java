package com.mytel.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.mytel.entity.customer;

public interface CustomerRepository extends JpaRepository<customer, Long> {
	
	public customer getById(Long phoneNo);

}
