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
@Table(name="excursions")
@Getter
@Setter
public class Excursion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "excursion_id")
    private Long id;

    private String excursion_title;
    private BigDecimal excursion_price;
    private String image_URL;
    @Column(name = "create_date")
    @CreationTimestamp
    private Date createDate;
    @Column(name = "last_update")
    @UpdateTimestamp
    private Date lastUpdate;

    @ManyToOne
    @JoinColumn(name ="vacation", nullable = false)
    private Vacation vacation;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cart")
    private Set<CartItem> cartItem;
}
