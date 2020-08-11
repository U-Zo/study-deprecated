package com.ex10_1;

public class Ex10_1 {
    public static void main(String[] args) {
        Object[] arr = {"홍길동", "이순신", "유관순", 100};
        for (Object obj : arr) {
            String name = (String)obj; // 예외 발생
            System.out.println("이름: " + name);
        }
    }
}
