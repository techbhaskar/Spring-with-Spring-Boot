package com.training.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
public static void main(String[] args) {
	
	
	AbstractApplicationContext beancontext = new ClassPathXmlApplicationContext("trainingbeans.xml");

	ExplainSpringBean obj = (ExplainSpringBean) beancontext.getBean("springBean");
    obj.getName();
    beancontext.registerShutdownHook();
	
	ApplicationContext app_context = new ClassPathXmlApplicationContext("applicationContext.xml");
	ExplainSpringIoc iocObj=(ExplainSpringIoc)app_context.getBean("iocbean");
	iocObj.displayInfo();
	
	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	ExplainSpringDi student=(ExplainSpringDi)context.getBean("setterInj");
	student.displayInfo();

	Resource resource=new ClassPathResource("applicationContext.xml");
	BeanFactory factory=new XmlBeanFactory(resource);
	ExplainSpringDiWithCon student1=(ExplainSpringDiWithCon)factory.getBean("contructorInj");
	student1.displayInfo(); 
	
}
}
