package com.example.commerce;

import javax.swing.plaf.IconUIResource;

//개별 상품 정보를 가지고 있는 클래스
public class Product {
    String name;
    Integer price;
    String explain;
    Integer count;

    public Product(String name, Integer price, String explain, Integer count) {
        this.name = name;
        this.price = price;
        this.explain = explain;
        this.count = count;

    }
    @Override
    public String toString() {
        return "상품명 | " +this.name
                +"가격  | " +this.price
                +"설명 | " +this.explain
                + "재고수량   |" + count;
    }
}