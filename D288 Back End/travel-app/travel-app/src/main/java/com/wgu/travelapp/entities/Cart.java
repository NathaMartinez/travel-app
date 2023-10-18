package com.wgu.travelapp.entities;


import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.ManyToAny;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name="carts")
@Getter
@Setter
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="cart_id")
    private Long id;
    @Column(name ="order_tracking_number")
    private String OrderTrackingNumber;
    @Column(name ="package_price")
    private BigDecimal packagePrice;
    @Column(name ="party_size")
    private int partySize;
    @Enumerated(EnumType.STRING)
    @Column(name ="status")
    private StatusType status;

    @Column(name = "create_date")
    @CreationTimestamp
    private Date createDate;
    @Column(name = "last_update")
    @UpdateTimestamp
    private Date lastUpdate;
    @ManyToOne
    @JoinColumn(name ="customer_id", nullable = false)
    private Customer customer;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cart")
    private Set<CartItem> cartItem;
}
