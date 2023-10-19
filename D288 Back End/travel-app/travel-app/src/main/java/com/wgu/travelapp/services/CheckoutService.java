package com.wgu.travelapp.services;

import com.wgu.travelapp.dto.Purchase;
import com.wgu.travelapp.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);


}
