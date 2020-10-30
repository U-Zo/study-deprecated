package com.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class StudentBeforeAspect {

    // point cut
    @Pointcut("execution(* call*(..))") // call 이라는 함수가 실행될 경우
    public void xxx() {} // 실제 공통 로직이 구현된 함수 // advice

    // join point
    @Before("xxx()")
    public void callEchoBefore(JoinPoint point) {
        System.out.println(point);
        System.out.println(point.getSignature().getName());
        System.out.println("callEchoBefore");
    }

    // advice + point cut
    @Before("execution(* sayEcho(..))")
    public void sayEchoBefore() {
        System.out.println("SayEchoBefore =============");
    }
}
