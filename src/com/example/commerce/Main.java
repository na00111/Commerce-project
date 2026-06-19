package com.example.commerce;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        products.add(new Product("Galaxy S25",  1_200_000, "최신 안드로이드 스마트폰",    0));
        products.add(new Product( "iPhone 16",   1_350_000, "Apple의 최신 스마트폰",   0    ));
        products.add(new Product("MacBook Pro", 2_400_000, "M3 칩셋이 탑재된 노트북",   0 ));
        products.add(new Product("AirPods Pro",   350_000, "노이즈 캔슬링 무선 이어폰",   0  ));
        CommerceSystem commerceSystem = new CommerceSystem(products);
       System.out.println("[실시간 커머스 플랫폼 - 전자제품]");
//        int i = 1;
//        for(Product p : products) {
//            System.out.println(i + ". " + p);
//            i ++;
//        }
//        System.out.println("0. 종료        프로그램 종료");
//        Scanner sc = new Scanner(System.in);
//        System.out.println("입력  :  ");
//        sc.nextInt();
//        if ("0".equals("0")) {
//            System.out.println("커머스 플랫폼을 종료합니다");
//        }
//


    }
}