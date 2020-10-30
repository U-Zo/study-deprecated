package com.dto;

import org.springframework.beans.factory.annotation.Value;

public class Student {

    @Value("홍길동")
    private String name;
    @Value("10")
    private int age;

    public Student() {
        System.out.println("생성자");
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }

}
