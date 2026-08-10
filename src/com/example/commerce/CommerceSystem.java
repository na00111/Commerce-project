package com.example.commerce;//프로그램 비즈니스 로직 클래스
//플랫폼의 상품을 관리하고 사용자 입력을 처리하는 클래스




import java.util.List;
import java.util.Scanner;

public class CommerceSystem {


    private List<Category> categoryList;
    Scanner sc = new Scanner(System.in);//초기값이 필요 없음 매핑해 줄거라서

    public CommerceSystem(List<Category> categoryList) {
        this.categoryList = categoryList;
    }

    public void start() {

        while (true) {
            System.out.println("[ 실시간 커머스 플랫폼 메인 ]");
            for (Integer index = 0; index < categoryList.size(); index++) {
                System.out.println(index + 1 + ". " + categoryList.get(index).getName());
            }
            System.out.println("0.  종료하기");
        Integer result = sc.nextInt();
            if (result > 0 && categoryList.size() >= result) {
                categoryList.get(result-1).start();
            }else {
                break;
            }
        }
    }
}