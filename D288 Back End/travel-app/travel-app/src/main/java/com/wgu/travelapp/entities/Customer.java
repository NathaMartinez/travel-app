package com.wgu.travelapp.entities;




import com.wgu.travelapp.entities.Division;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.ManyToAny;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="customers")
@Getter
@Setter


public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private Long id;
    @Column(name = "customer_first_name", nullable = false)
    private String firstName;
    @Column(name = "customer_last_name",nullable = false)
    private String lastName;
    @Column(name = "address",nullable = false)
    private String address;
    @Column(name = "postal_code",nullable = false)
    private String postalCode;
    @Column(name = "phone",nullable = false)
    private String phone;
    @Column(name = "create_date")
    @CreationTimestamp
    private Date createDate;
    @Column(name = "last_update")
    @UpdateTimestamp
    private Date lastUpdate;
    /*
    @OneToMany
    @JoinColumn(name = "Division_ID",nullable = false)
    private Division division;
     */
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "customer")
    private Set<Cart> carts;
    @OneToOne
    @PrimaryKeyJoinColumn
    private Cart cart;

    public Customer(String firstName, String lastName, String address, String postalCode, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.postalCode = postalCode;
        this.phone = phone;
    }

    public Customer() {


    }

    public void add(Cart cart) {
        if(cart != null) {
            
            if (carts == null) {
                carts = new HashSet<>();
            }
            carts.add(cart);
            cart.setCustomer(this);
        }
    }
}
