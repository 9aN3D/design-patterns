package com.kovalchv.controller;

import lombok.AllArgsConstructor;
import lombok.NonNull;

import java.math.BigDecimal;

@AllArgsConstructor
public class CreditCardAlgorithm implements Payment {

    private String name;
    private String cardNumber;

    @Override
    public void pay(@NonNull BigDecimal amount) {
        System.out.println(amount + " paid with Card.");
    }

}
