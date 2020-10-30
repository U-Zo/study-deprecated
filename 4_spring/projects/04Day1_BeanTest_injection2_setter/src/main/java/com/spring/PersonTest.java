package com.spring;

import org.springframework.context.support.GenericXmlApplicationContext;

public class PersonTest {

    public static void main(String[] args) {

        GenericXmlApplicationContext ctx =
                new GenericXmlApplicationContext("classpath:com/spring/person.xml");

        Person p = ctx.getBean("xxx", Person.class);
        Person p1 = ctx.getBean("xxx1", Person.class);
        Person p2 = ctx.getBean("xxx2", Person.class);
        Person p3 = ctx.getBean("xxx3", Person.class);

        System.out.println(p.getInfo());
        System.out.println(p1.getInfo());
        System.out.println(p2.getInfo());
        System.out.println(p3.getInfo());
    }

}
