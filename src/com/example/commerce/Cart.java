package com.example.commerce;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Product> cartItems = new ArrayList<>();

    public void addProduct(Product product) {
        cartItems.add(product);
    }
    public void showCartList() {
        if (cartItems.isEmpty()) {
            System.out.println("장바구니에 아무것도 없습니다");
            return;
        }
        System.out.println(" [장바구니 내역]");
        int total = 0;

        for (Product p: cartItems ) {
            System.out.println(p);
            total += p.get가격();
        }
    }

}
