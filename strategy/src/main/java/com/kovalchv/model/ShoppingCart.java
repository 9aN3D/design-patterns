package com.kovalchv.model;

import com.kovalchv.controller.Payment;
import lombok.Getter;
import lombok.NonNull;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static java.math.BigDecimal.ZERO;

@Getter
public class ShoppingCart {

    private List<Product> products;

    public ShoppingCart() {
        this.products = new ArrayList<>();
    }

    public void addProduct(@NonNull Product product) {
        this.products.add(product);
    }

    public void removeProduct(@NonNull Product product) {
        this.products.remove(product);
    }

    public void pay(@NonNull Payment paymentStrategy) {
        BigDecimal amount = calculateTotal();
        paymentStrategy.pay(amount);
    }

    private BigDecimal calculateTotal() {
        return products.stream()
                .map(Product::getPrice)
                .reduce(ZERO, BigDecimal::add);
    }

}
