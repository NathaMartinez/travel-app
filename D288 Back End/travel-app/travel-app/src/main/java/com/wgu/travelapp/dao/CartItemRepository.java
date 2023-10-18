package com.wgu.travelapp.dao;

import com.wgu.travelapp.entities.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {
}
