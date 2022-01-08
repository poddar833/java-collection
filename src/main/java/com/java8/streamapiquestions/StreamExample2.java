package com.java8.streamapiquestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamExample2 {

    private static Predicate<Product> priceFilter = (item) -> item.getPrice() > 25000f;
    private static Predicate<Product> modelFilter = (item) -> item.getModel().contains("HP");
    private static Consumer<Product> displayProduct = (item) -> System.out.println(item);
    private static List<Product> productsList = new ArrayList<>();

    static {
        // Adding Products
        productsList.add(new Product(1, "HP Laptop", 25000f));
        productsList.add(new Product(2, "Dell Laptop", 30000f));
        productsList.add(new Product(3, "Lenevo Laptop", 28000f));
        productsList.add(new Product(4, "Sony Laptop", 28000f));
        productsList.add(new Product(5, "Apple Laptop", 90000f));
    }

    public static void filterationExample() {
        //display all the products
        productsList.stream().forEach(displayProduct);

        System.out.println("Display based on filtered price");
        //filter the price all the products
        productsList.stream().filter(priceFilter).forEach(displayProduct);

        System.out.println("Display based on filtered model");
        //filter the price all the Model
        productsList.stream().filter(modelFilter).forEach(displayProduct);
    }

    public static void convertIntoSet() {
        Set<String> modelSet = productsList.stream().map(item -> item.getModel()).collect(Collectors.toSet());
        modelSet.stream().forEach(item -> System.out.println(item));
    }

    public static void getMin() {
        Optional<Product> product = productsList.stream().max((p1, p2) -> {
            if (p1.getPrice() > p2.getPrice())
                return 1;
            else if (p1.getPrice() < p2.getPrice())
                return -1;
            else return 0;
        });

    }

    public static void main(String[] args) {
        convertIntoSet();
    }
}
