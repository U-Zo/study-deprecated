package com.dto;

public class TestDTO {
    int num;
    String username;
    String address;

    public TestDTO() {
        super();
    }

    public TestDTO(int num, String username, String address) {
        this.num = num;
        this.username = username;
        this.address = address;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "TestDAO{" +
                "num=" + num +
                ", username='" + username + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
