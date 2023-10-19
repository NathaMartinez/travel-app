package com.wgu.travelapp.dto;

import com.wgu.travelapp.entities.Cart;
import com.wgu.travelapp.entities.CartItem;
import com.wgu.travelapp.entities.Customer;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {
    private Customer customer;
    private Customer address;
    private Customer postal_code;
    private Cart cart;
    private Set<CartItem> cartItems;
}
