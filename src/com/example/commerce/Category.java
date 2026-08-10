package com.example.commerce;

import com.example.commerce.Product;

import java.util.List;
import java.util.Scanner;

//product 클래스를 관리하는 클래스
public class Category {
    private List<Product> productList;
    private String name;

    public Category(List<Product> productList, String name) {
        this.productList = productList;
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void start() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("[실시간 커머스 플랫폼] " + this.name );
            for (Integer index = 0; index < productList .size(); index++) {
                System.out.println(index + 1 + ". " + productList.get(index).toString());
            }
            System.out.println("0. 뒤로가기");

            Integer result = 0;

            try {
                result = sc.nextInt();

            } catch (Exception e) {
                System.out.println("값이 잘못되었습니다");
            }

            System.out.println("들어온 값은 결과 입니다" + result + "입니다");

            if (result > 0 && productList.size() >= result) {
                System.out.println(productList.get(result - 1).toString());
            } else {
                break;
            }
        }
    }
}