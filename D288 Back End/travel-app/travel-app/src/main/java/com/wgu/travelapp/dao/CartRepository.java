package com.wgu.travelapp.dao;

import com.wgu.travelapp.entities.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")
@RepositoryRestResource(collectionResourceRel = "Cart", path = "carts")
public interface CartRepository extends JpaRepository<Cart, Long> {
}
