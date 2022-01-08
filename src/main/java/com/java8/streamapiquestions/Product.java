package com.java8.streamapiquestions;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Product {
    private int id;
    private String model;
    private float price;

    public Product(int id, String model, float price) {
        this.id = id;
        this.model = model;
        this.price = price;
    }
}
