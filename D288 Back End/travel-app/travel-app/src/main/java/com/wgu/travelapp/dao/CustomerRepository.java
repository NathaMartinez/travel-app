package com.wgu.travelapp.dao;

import com.wgu.travelapp.entities.Cart;
import com.wgu.travelapp.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
