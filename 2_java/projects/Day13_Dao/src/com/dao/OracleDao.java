package com.dao;

import com.person.Person;

import java.util.HashSet;

public class OracleDao {
    public HashSet<Person> select() {
        HashSet<Person> set = new HashSet<>();
        set.add(new Person("홍길동", 20, "서울"));
        set.add(new Person("유관순", 21, "인천"));
        set.add(new Person("이순신", 22, "경기"));

        return set;
    }
}
