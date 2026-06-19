package com.example.commerce;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//프로그램 비즈니스 로직 클래스
//커머스 플랫폼의 상품을 관리하고 사용자 입력을 처리하는 클래스이다.
public class CommerceSystem {
    List<Product> products = new ArrayList<>();

        public CommerceSystem(List<Product> products) {
            this.products = products;
        }


    public void Start() {
        System.out.println("[실시간 커머스 플랫폼 - 전자제품]");
        products.add(new Product("Galaxy S25",  1_200_000, "최신 안드로이드 스마트폰",    0));
        products.add(new Product( "iPhone 16",   1_350_000, "Apple의 최신 스마트폰",   0    ));
        products.add(new Product("MacBook Pro", 2_400_000, "M3 칩셋이 탑재된 노트북",   0 ));
        products.add(new Product("AirPods Pro",   350_000, "노이즈 캔슬링 무선 이어폰",   0  ));

        int i = 1;
        for (Product p : products) {
            System.out.println(i + ". " + p);
            i++;
        }
        System.out.println("0. 종료        프로그램 종료");
        Scanner sc = new Scanner(System.in);
        System.out.println("입력  :  ");
        sc.nextInt();
        if ("0".equals("0")) {
            System.out.println("커머스 플랫폼을 종료합니다");
        }
    }
}