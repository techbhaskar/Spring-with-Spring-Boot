package com.training.aop;

import org.springframework.core.io.Resource;  
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Test {  
public static void main(String[] args) {  
    Resource r=new ClassPathResource("applicationContext.xml");  
    BeanFactory factory=new XmlBeanFactory(r);  
      
    A1 a=factory.getBean("proxy",A1.class);  
    a.m1();  
}  
}  