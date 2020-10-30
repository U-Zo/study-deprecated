package com.spring;

public class Person {
   public Person(String x) {
      System.out.println("Person 생성자"+x);
   }
   public Person(String x, String y) {
      System.out.println("Person 생성자"+x+"\t"+y);
   }
   public Person(String xx,int yy) {
      System.out.println("Person 생성자"+xx+"\t"+yy);
   }
   public String getInfo() {
      return "이순신";
   }
}