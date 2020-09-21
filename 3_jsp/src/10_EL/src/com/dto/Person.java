package com.dto;

public class Person {
    private String username;
    private int age;
    
    public Person() {
        // TODO Auto-generated constructor stub
    }

    public Person(String username, int age) {
        super();
        this.username = username;
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setName(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
