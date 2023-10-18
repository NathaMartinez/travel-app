package com.wgu.travelapp.dao;

import com.wgu.travelapp.entities.Cart;
import com.wgu.travelapp.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
