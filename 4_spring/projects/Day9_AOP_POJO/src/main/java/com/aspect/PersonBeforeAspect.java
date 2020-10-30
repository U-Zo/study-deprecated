package com.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

public class PersonBeforeAspect {

    public void mesgBefore() {
        System.out.println("mesgBefore()");
    }
}
