
package com.example.commerce;
import com.example.commerce.Category;
import com.example.commerce.CommerceSystem;
import com.example.commerce.Product;

import java.util.ArrayList;
import java.util.List;



//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Category> categoryList = createCategory();
        CommerceSystem commerceSystem = new CommerceSystem(createCategory());
        commerceSystem.start();

    }
    public static List<Category> createCategory() {
        List<Product> productList = new ArrayList<>();

        productList.add(new Product("Galaxy S24", 1200000, "최신 스마트폰", 50));
        productList.add(new Product("iPhone 16 ", 1350000, "Apple의 최신 스마트폰", 50));
        productList.add(new Product("MacBook Pro ", 2400000, "M3 칩셋이 탑재된 노트북", 50));
        productList.add(new Product("AirPods Pro", 350000, "노이즈 캔슬링 무선 이어폰", 50));

        List<Product> productList2 = new ArrayList<>();

        productList2.add(new Product("11", 1200000, "최신 스마트폰", 50));
        productList2.add(new Product("22 ", 1350000, "Apple의 최신 스마트폰", 50));
        productList2.add(new Product("33 ", 2400000, "M3 칩셋이 탑재된 노트북", 50));
        productList2.add(new Product("44", 350000, "노이즈 캔슬링 무선 이어폰", 50));

        List<Product> productList3 = new ArrayList<>();

        productList3.add(new Product(" aaaa", 1200000, "최신 스마트폰", 50));
        productList3.add(new Product(" ffff ", 1350000, "Apple의 최신 스마트폰", 50));
        productList3.add(new Product("dddd", 2400000, "M3 칩셋이 탑재된 노트북", 50));
        productList3.add(new Product("ssss", 350000, "노이즈 캔슬링 무선 이어폰", 50));

        List<Product> productList4 = new ArrayList<>();

        productList4.add(new Product("plplp", 1200000, "최신 스마트폰", 50));
        productList4.add(new Product("plpl ", 1350000, "Apple의 최신 스마트폰", 50));
        productList4.add(new Product("plpl ", 2400000, "M3 칩셋이 탑재된 노트북", 50));
        productList4.add(new Product("plplpl", 350000, "노이즈 캔슬링 무선 이어폰", 50));

        List<Category> categories = new ArrayList<>();
        categories.add(new Category(productList, "전자제품"));
        categories.add(new Category(productList2, "의류"));
        categories.add(new Category(productList3, "식품"));

        return categories;
    }
}
