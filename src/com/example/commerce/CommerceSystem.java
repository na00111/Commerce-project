package com.example.commerce;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//프로그램 비즈니스 로직 클래스
//커머스 플랫폼의 상품을 관리하고 사용자 입력을 처리하는 클래스이다.
public class CommerceSystem {

    private List<Category> categories;

    //생성자 (객체 초기화 메서드)  객체 생성은 new연산자가, 객체 초기화는 생성자가
    public CommerceSystem(List<Category> categories) {
        this.categories = categories;
    }

    private Category category;
    private Customer customer;


    public CommerceSystem(List<Category> categories, Customer customer) {
        this.categories = categories;
        this.customer = customer;
    }

    public void Start() {
        Scanner sc = new Scanner(System.in);

        int mainManu = -7;

        while (mainManu != 0) {
            System.out.println("\n[실시간 커머스 플랫폼 메인]");
            int i = 1;
            for (Category c : categories) {
                System.out.println(i + ". " + c.getName());
                //get쓰는 이유 카테고리 클래스에서 네임을 프라이빗으로 설정해서 ,make a field readable
                i++; //카테고리에 이름이 무한대로 추가 가능?
            }
            System.out.println("0. 종료        | 프로그램 종료");
            System.out.println("입력 : ");
            mainManu = sc.nextInt();



            if (mainManu == 0) {
                System.out.println("커머스 플랫폼을 종료합니다");
                break;
            }
            if (mainManu > 0 && mainManu <= categories.size()) {
                Category selectedCategory = categories.get(mainManu - 1);
                 showCategoryDetail(selectedCategory,sc);
            } else {
                System.out.println(("잘못된 번호입니다. 다시 입력해주세요!"));
            }


// 처음에 만든 일회성 코드
//        int i = 1;
//        for (Category c : categories) {
//            System.out.println(i + ". " + c);
//            i++;
//        }
//        System.out.println("0. 종료        프로그램 종료");
//        Scanner sc = new Scanner(System.in);
//        System.out.println("입력  :  ");
//        int input = sc.nextInt();
//        if (input == 0) {
//            System.out.println("커머스 플랫폼을 종료합니다");
        }
    }

    private void showCategoryDetail(Category category, Scanner sc) {
        int productMenu = -7;

        while (productMenu != 0) {
            System.out.println("\n[" + category.getName() + "카테고리 ]");

            int i = 1;
            List<Product> products = category.getProducts();
            for (Product p : products) {
                System.out.println(i + ". " + p);
                i++;
            }
            System.out.println("0. 뒤로가기");
            System.out.println("입력 : ");
            productMenu = sc.nextInt();

            if (productMenu == 0) {
                break;
            }
            if (productMenu > 0 && productMenu <= products.size()) {
                Product selectedProduct = products.get(productMenu - 1);
                System.out.println("\n 선택한 상품\n" +selectedProduct + "|재고 :" + selectedProduct.get재고수량() +"개");

                System.out.println("위 상품을 장바구니에 추가하시겠습니까?");
                System.out.println("1.확인          2.취소");
                int cartMenu = sc.nextInt();

                if (cartMenu == 1) {
                    System.out.println(selectedProduct.get상품명() +" 상품이 장바구니에 추가되었습니다");
                } else if (cartMenu == 2) {
                    System.out.println(selectedProduct.get상품명() +" 장바구니 추가를 취소했습니다");
                }else {
                    System.out.println("잘못된 입력입니다. 메인 메뉴로 돌아갑니다.");
                }
                break;
            }
        }
    }
}