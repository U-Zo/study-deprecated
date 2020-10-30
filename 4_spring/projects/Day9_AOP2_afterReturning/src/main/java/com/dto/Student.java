package com.dto;

public class Student {

    public String sayEcho() {
        System.out.println("sayEcho()");

        return "Hello";
    }

    public String callEcho() {
        System.out.println("callEcho()");

        return "World";
    }
}
