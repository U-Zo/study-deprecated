package com.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class StudentAfterThrowingAspect {

    @AfterThrowing(pointcut = "execution(* sayEcho(..))", throwing = "ex")
        public void sayEchoAfterThrowing(JoinPoint joinPoint, Exception ex) {
        System.out.println(joinPoint.getSignature());
        System.out.println("sayEchoAfterThrowing ==== " + ex);
    }
}
