package com.example.commerce;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//프로그램 비즈니스 로직 클래스
//커머스 플랫폼의 상품을 관리하고 사용자 입력을 처리하는 클래스이다.
public class CommerceSystem {

private List<Category> categories;

public CommerceSystem(List<Category> categories) {
    this.categories = categories;
}

private  Category category;
private Customer customer;

public CommerceSystem(List<Category> category, Customer customer) {
    this.categories = categories;
    this.customer = customer;
}

    public void Start() {
        System.out.println("[실시간 커머스 플랫폼 메인]");

        int i = 1;
        for (Category c : categories) {
            System.out.println(i + ". " + c);
            i++;
        }
        System.out.println("0. 종료        프로그램 종료");
        Scanner sc = new Scanner(System.in);
        System.out.println("입력  :  ");
        int input = sc.nextInt();
        if (input == 0) {
            System.out.println("커머스 플랫폼을 종료합니다");
        }
    }
}