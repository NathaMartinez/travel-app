package com.wgu.travelapp.dao;

import com.wgu.travelapp.entities.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(collectionResourceRel = "Cart", path = "carts")
public interface CartRepository extends JpaRepository<Cart, Long> {
}
