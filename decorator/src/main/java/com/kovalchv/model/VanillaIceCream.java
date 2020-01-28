package com.kovalchv.model;

import com.kovalchv.interfaces.IceCream;
import com.kovalchv.interfaces.IceCreamDecorator;

import java.math.BigDecimal;

public class VanillaIceCream extends IceCreamDecorator {

    public VanillaIceCream(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public BigDecimal cost() {
        return super.cost().add(new BigDecimal("0.7"));
    }
}
