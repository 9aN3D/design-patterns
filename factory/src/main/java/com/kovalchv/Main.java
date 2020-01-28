package com.kovalchv;

import com.kovalchv.interfaces.HamburgerStore;
import com.kovalchv.model.CheeseBurger;
import com.kovalchv.model.Hamburger;
import com.kovalchv.model.JamHamburgerStore;
import com.kovalchv.model.MozHamburgerStore;

public class Main {

    public static void main(String... args) {

        CheeseBurger cheeseBurger = new CheeseBurger();

        HamburgerStore mozambicanBurgerStore = new MozHamburgerStore();
        HamburgerStore jamaicanBurgerStore = new JamHamburgerStore();

        Hamburger hamburger = mozambicanBurgerStore.orderHamburger("cheese");
        System.out.println("Paulo ordered " + hamburger.getName() + "\n" );


        hamburger = jamaicanBurgerStore.orderHamburger("veggie");
        System.out.println("James Bond ordered: " + hamburger.getName() + "\n");

    }

}
