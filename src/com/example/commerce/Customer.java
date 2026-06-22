package com.example.commerce;

public class Customer {
   private String 고객명;
   private String 이메일;
    private String 등급;

    public Customer(String name, String email, String grade) {
        고객명 =name;
        이메일 = email;
        등급 = grade;
        //this 안쓴 이유 매개변수와 이름이 다르니까(영어로) 그래서 this를 쓰지 않았습니다.
    }
public String get고객명() {
        return 고객명;
}
}
