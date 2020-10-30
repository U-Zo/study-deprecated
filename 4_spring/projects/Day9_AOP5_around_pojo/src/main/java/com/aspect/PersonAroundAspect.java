package com.aspect;

import org.aspectj.lang.ProceedingJoinPoint;

public class PersonAroundAspect {

    public Object around(ProceedingJoinPoint joinPoint) {
        Object obj = null;
        System.out.println("around 함수 실행 before =========");
        try {
            obj = joinPoint.proceed();
            System.out.println("around 함수 실행 후 ==========");
        } catch (Throwable e) {
            e.printStackTrace();
        }

        return obj;
    }
}
