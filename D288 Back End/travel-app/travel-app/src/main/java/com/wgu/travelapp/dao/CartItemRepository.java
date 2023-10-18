package com.wgu.travelapp.dao;

import com.wgu.travelapp.entities.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "CartItem", path = "cart_items")
public interface CartItemRepository extends JpaRepository<CartItem, Long> {
}
