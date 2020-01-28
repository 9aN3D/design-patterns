package com.kovalchv.model;

import com.kovalchv.interfaces.IceCream;
import com.kovalchv.interfaces.IceCreamDecorator;

import java.math.BigDecimal;

public class PecanIceCream extends IceCreamDecorator {

    public PecanIceCream(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public BigDecimal cost() {
        return super.cost().add(new BigDecimal("1.35"));
    }

}
