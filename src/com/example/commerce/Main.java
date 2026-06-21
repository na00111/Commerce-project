package com.example.commerce;

import javax.xml.stream.events.StartDocument;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        Category electronics = new Category("전자제품");
        Category clothing = new Category("의류");
        Category food = new Category("식품");

        electronics.addProduct(new Product("Galaxy S25",  1_200_000, "최신 안드로이드 스마트폰",    0));
        electronics.addProduct(new Product("iPhone 16" , 1_350_000, "Apple의 최신 스마트폰",   0  ));
        electronics.addProduct(new Product("MacBook Pro", 2_400_000, "M3 칩셋이 탑재된 노트북",     0  ));
        electronics.addProduct(new Product("AirPods Pro",   350_000, "노이즈 캔슬링 무선 이어폰",   0   ));

        List<Category> categories = new ArrayList<>();
        categories.add(electronics);
        categories.add(clothing);
        categories.add(food);

        }
    }
