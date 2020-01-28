package com.kovalchv.model;

import com.kovalchv.interfaces.IceCream;

import java.math.BigDecimal;

public class BasicIceCream implements IceCream {

    public BasicIceCream() {
        System.out.println("Creating a basic Ice-Cream!");
    }

    @Override
    public BigDecimal cost() {
        return new BigDecimal("0.5");
    }

}
