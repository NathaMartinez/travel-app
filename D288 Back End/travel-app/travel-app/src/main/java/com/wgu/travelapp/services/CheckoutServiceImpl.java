package com.wgu.travelapp.services;

import com.wgu.travelapp.dao.CartRepository;
import com.wgu.travelapp.dao.CustomerRepository;
import com.wgu.travelapp.dto.Purchase;
import com.wgu.travelapp.dto.PurchaseResponse;
import com.wgu.travelapp.entities.Cart;
import com.wgu.travelapp.entities.CartItem;
import com.wgu.travelapp.entities.Customer;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.UUID;

@Service
public class CheckoutServiceImpl implements CheckoutService{
    private CustomerRepository customerRepository;
    private CartRepository cartRepository;
    public CheckoutServiceImpl(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }
    @Override
    @Transactional
    public PurchaseResponse placeOrder(Purchase purchase) {
        //retrieve the order info from Purchase response
        Cart cart = purchase.getCart();

        //generate tracking number
        String orderTrackingNumber = generateOrderTrackingNumber();
        cart.setOrderTrackingNumber(orderTrackingNumber);

        //populate order with CartItems
        Set<CartItem> cartItems = purchase.getCartItems();
        cartItems.forEach(item -> cart.add(item));

        //populate order wth customer info:postal code

        //populate customer with order
        Customer customer = purchase.getCustomer();
        customer.add(cart);
        //save o the database

        customerRepository.save(customer);


        //return a response: Utilize Purchase response, and pass in generated order tracking number
        return new PurchaseResponse(orderTrackingNumber);
    }

    private String generateOrderTrackingNumber() {
        //generate a random UUID number(UUID version-4)
        return UUID.randomUUID().toString();
    }
}
