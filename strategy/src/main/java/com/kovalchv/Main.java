package com.kovalchv;

import com.kovalchv.controller.CreditCardAlgorithm;
import com.kovalchv.controller.PaypalAlgorithm;
import com.kovalchv.model.Product;
import com.kovalchv.model.ShoppingCart;

public class Main {

    public static void main(String... args) {

        ShoppingCart cart = new ShoppingCart();

        Product pants = new Product(25, "2132");
        Product shirt = new Product(15, "57567");

        cart.addProduct(pants);
        cart.addProduct(shirt);

        //payment decisions
        cart.pay(new PaypalAlgorithm("test@gmail.com", "asdasd"));
        cart.pay(new CreditCardAlgorithm("test", "1233232133"));
    }

}
