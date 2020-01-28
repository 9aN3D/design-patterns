package com.kovalchv.model;

import com.kovalchv.interfaces.IceCream;
import com.kovalchv.interfaces.IceCreamDecorator;

import java.math.BigDecimal;

public class ChocolateIceCream extends IceCreamDecorator {

    public ChocolateIceCream(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public BigDecimal cost() {
        return super.cost().add(new BigDecimal("1.0"));
    }

}
