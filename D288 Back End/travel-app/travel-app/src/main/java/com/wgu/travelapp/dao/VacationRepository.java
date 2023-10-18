package com.wgu.travelapp.dao;

import com.wgu.travelapp.entities.Cart;
import com.wgu.travelapp.entities.Vacation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VacationRepository extends JpaRepository<Vacation, Long> {
}
