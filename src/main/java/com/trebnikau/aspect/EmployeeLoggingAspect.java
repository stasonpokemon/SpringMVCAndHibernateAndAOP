package com.trebnikau.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class EmployeeLoggingAspect {

    @Around("execution(* com.trebnikau.dao.*.*(..))")
    public Object aroundAllRepositoryMethodsAdvise(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        MethodSignature methodSignature = (MethodSignature) proceedingJoinPoint.getSignature();
        String methodName = methodSignature.getName();
        System.out.println("Begin of " + methodName);

        Object result = proceedingJoinPoint.proceed();

        System.out.println("End of " + methodName);

        return result;
    }
}
