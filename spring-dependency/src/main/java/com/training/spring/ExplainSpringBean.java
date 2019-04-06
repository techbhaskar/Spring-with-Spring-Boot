package com.training.spring;

public class ExplainSpringBean {
private String name;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
public void init(){
    System.out.println("Bean is going through init.");
 }
 public void destroy(){
    System.out.println("Bean will destroy now.");
 }
public void displayInfo(){
	System.out.println("Hello: "+name);
}
}
