package com.training.aop;

import org.aopalliance.intercept.MethodInterceptor;  
import org.aopalliance.intercept.MethodInvocation;  

public class AroundAdvisorTest implements MethodInterceptor{  
	  
    @Override  
    public Object invoke(MethodInvocation mi) throws Throwable {  
        Object obj;  
        System.out.println("additional concern before actual logic from AroundAdvisorTest");  
        obj=mi.proceed();  
        System.out.println("additional concern after actual logic from AroundAdvisorTest");  
        return obj;  
    }  
  
}  
