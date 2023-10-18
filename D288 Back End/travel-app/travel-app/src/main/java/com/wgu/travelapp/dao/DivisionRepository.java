package com.wgu.travelapp.dao;

import com.wgu.travelapp.entities.Cart;
import com.wgu.travelapp.entities.Division;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DivisionRepository extends JpaRepository<Division, Long> {
}
