package com.wgu.travelapp.dao;

import com.wgu.travelapp.entities.Cart;
import com.wgu.travelapp.entities.Excursion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExcursionRepository extends JpaRepository<Excursion, Long> {
}
