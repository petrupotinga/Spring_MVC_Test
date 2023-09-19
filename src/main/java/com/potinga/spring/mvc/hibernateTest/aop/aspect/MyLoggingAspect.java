package com.potinga.spring.mvc.hibernateTest.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Component
@Aspect
public class MyLoggingAspect {
    @Around("execution(* com.potinga.spring.mvc.hibernateTest.aop.dao.*.*(..))")
    public Object aroundAllRepositoryMethodsAdvice(
            ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        MethodSignature methodSignature =
                (MethodSignature) proceedingJoinPoint.getSignature();
        String methodName = methodSignature.getName();
        System.out.println("Begin off" + methodName);
        Object targetMethodResult = proceedingJoinPoint.proceed();
        System.out.println("End off" + methodName);
        return targetMethodResult;
    }
}
