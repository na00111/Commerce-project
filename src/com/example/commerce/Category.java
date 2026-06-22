package com.example.commerce;
//product클래스를 관리하는 클래스

import java.util.ArrayList;
import java.util.List;

public class Category {
    private String name;
    private List<Product> products = new ArrayList<>();

    public Category(String name) {
        this.name = name;
    }
    public void addProduct(Product product) {
        this.products.add(product);
    }
    public String getName() {
        return name;
    }
    public List<Product> getProducts() {
        return products;
    }




}
