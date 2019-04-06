package com.training.spring;

public class ExplainSpringDiWithCon {
	private int id;
	private String name;
	private String city;

	
	public ExplainSpringDiWithCon() {System.out.println("default constructor");}  
	  
	public ExplainSpringDiWithCon(int id) {this.id = id;}  
	  
	public ExplainSpringDiWithCon(String name) {  this.name = name;}  
	  
	public ExplainSpringDiWithCon(int id, String name) {  
	    this.id = id;  
	    this.name = name;  
	}
	public ExplainSpringDiWithCon(int id, String name,String city) {  
	    this.id = id;  
	    this.name = name;
	    this.city = city;
	}
	public void displayInfo() {
		System.out.println(id + " " + name + " " + city);
	}
}
