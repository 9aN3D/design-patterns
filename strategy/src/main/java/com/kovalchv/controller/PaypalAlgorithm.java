package com.kovalchv.controller;

import lombok.AllArgsConstructor;
import lombok.NonNull;

import java.math.BigDecimal;

@AllArgsConstructor
public class PaypalAlgorithm implements Payment {

    private String email;
    private String password;

    @Override
    public void pay(@NonNull BigDecimal amount) {
        System.out.println(amount + " paid with Paypal.");
    }

}
