package com.kovalchv;

import com.kovalchv.interfaces.IceCream;
import com.kovalchv.model.BasicIceCream;
import com.kovalchv.model.PecanIceCream;
import com.kovalchv.model.VanillaIceCream;

public class Main {

    public static void main(String... args) {

        IceCream basicIceCream = new BasicIceCream();
        System.out.println("Basic Ice-cream cost $" + basicIceCream.cost());

        //Add Vanilla to the order
        IceCream vanilla = new VanillaIceCream(basicIceCream);
        System.out.println("Vanilla Ice-cream cost $" + vanilla.cost());

        //Add Pecan to the order
        IceCream pecan = new PecanIceCream(vanilla);
        System.out.println("Pecan Ice-cream cost $" + pecan.cost());

    }

}
