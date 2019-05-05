package com.training.aop;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class AfterAdvisorTest implements AfterReturningAdvice{  
    @Override  
    public void afterReturning(Object returnValue, Method method,  
         Object[] args, Object target) throws Throwable {  
          
        System.out.println("additional concern after returning advice");  
    }  
  
}  
