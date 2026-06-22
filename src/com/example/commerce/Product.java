package com.example.commerce;
//상품면, 가격, 설명 ,재고수량
public class Product {
    //인스턴스 변수를 만들기
   private String 상품명;
   private int 가격;
   private String 설명;
   private  int 재고수량;

   //메서드 만들기
   //매개변수를 만들어주는 이유 ->메서드를 사용시 값을 불러와 this.변수에 넣어주기 위해서?
    public Product(String 상품명, int 가격 , String 설명 , int 재고수량) {
        this.상품명 = 상품명;
        this.가격  =  가격;
        this.설명 = 설명;
        this.재고수량 = 재고수량;
    }
    public  String get상품명() {
        return 상품명;
    }
    public int get가격() {
        return 가격;
    }
    public String 설명() {
        return 설명;
    }

    public int get재고수량() {
        return 재고수량;
    }

    public  void set재고수량(int 재고수량) {
        if (재고수량 <0) {
            System.out.println("재고는 0개 미안이 될 수 없습니다");
            return;
        }
        this.재고수량 = 재고수량;
    }
    @Override
    public String toString() {
        return 상품명 + "|" + String.format("%,d",가격) +"|" +설명 +"|" + 재고수량;
    }
}
