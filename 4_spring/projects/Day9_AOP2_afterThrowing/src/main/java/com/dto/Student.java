package com.dto;

public class Student {

    public String sayEcho() {
        System.out.println("sayEcho 호출");
        int n = 10 / 0;
        return "Hello";
    }

    public String callEcho() {
        System.out.println("callEcho 호출");
        return "World";
    }
}
