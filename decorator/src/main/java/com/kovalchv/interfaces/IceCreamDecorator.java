package com.kovalchv.interfaces;

import java.math.BigDecimal;

public class IceCreamDecorator implements IceCream {

    private IceCream iceCream;

    public IceCreamDecorator(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public BigDecimal cost() {
        return this.iceCream.cost();
    }

}
