package com.kovalchv.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class Product {

    private BigDecimal price;

    private String upcCode;

    public Product(int price, String upcCode) {
        this.price = new BigDecimal(price);
        this.upcCode = upcCode;
    }
}
