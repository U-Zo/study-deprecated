package com.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class PersonBeforeAspect {

//    @Around("execution(* *(..))")
//    public Object beforeGetInfo(ProceedingJoinPoint joinPoint) throws Throwable {
//        System.out.println("beforeGetInfo");
//
//        try {
//            return joinPoint.proceed();
//        } finally {
//            System.out.println("afterGetInfo");
//        }
//    }

    @Before("execution(* *(..))")
    public void beforeGetInto() {
        System.out.println("beforeGetInfo()");
    }
}
