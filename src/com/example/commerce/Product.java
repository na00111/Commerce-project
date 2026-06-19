package com.example.commerce;
//상품면, 가격, 설명 ,재고수량
public class Product {
    //인스턴스 변수를 만들기
   String 상품명;
   int 가격;
   String 설명;
   int 재고수량;

   //메서드 만들기
   //매개변수를 만들어주는 이유 ->메서드를 사용시 값을 불러와 this.변수에 넣어주기 위해서?
    public Product(String 상품명, int 가격 , String 설명 , int 재고수량) {
        this.상품명 = 상품명;
        this.가격  =  가격;
        this.설명 = 설명;
        this.재고수량 = 재고수량;
    }
}
