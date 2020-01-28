package com.kovalchv.interfaces;

import com.kovalchv.model.Hamburger;

public abstract class HamburgerStore {

    abstract public Hamburger createHamburger(String type);

    public Hamburger orderHamburger(String type) {
        Hamburger burger;

        //burger = factory.createHamburger(type);
        burger = createHamburger(type);

        burger.prepare();
        burger.cook();
        burger.box();

        return burger;
    }

}
