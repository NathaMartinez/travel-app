package com.wgu.travelapp.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name="vacations")
@Getter
@Setter
public class Vacation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="vcacation_id")
    private Long id;

    private String vacation_title;
    private String description;
    private BigDecimal travel_price;
    private String image_URL;

    @Column(name = "create_date")
    @CreationTimestamp
    private Date createDate;
    @Column(name = "last_update")
    @UpdateTimestamp
    private Date lastUpdate;
    @ManyToOne
    @JoinColumn(name ="customer_id", nullable = false)
    private Customer customer;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "vacation")
    private Set<Excursion> excursions;
}


