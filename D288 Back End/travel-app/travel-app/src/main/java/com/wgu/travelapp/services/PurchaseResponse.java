package com.wgu.travelapp.services;
//sends back a java object as a json

import lombok.Data;
import lombok.NonNull;

@Data

public class PurchaseResponse {
    @NonNull
    private  String orderTrackingNumber;
}
