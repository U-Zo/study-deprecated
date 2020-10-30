package com.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class StudentAfterReturningAspect {

    @AfterReturning(pointcut = "execution(* sayEcho(..))", returning = "retVal")
    public void sayEchoAfterReturning(JoinPoint joinPoint, Object retVal) {
        System.out.println(joinPoint.getSignature());
        System.out.println("sayEchoAfterReturning() ====== " + retVal);
    }
}
