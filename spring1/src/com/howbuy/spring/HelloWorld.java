package com.howbuy.spring;

public class HelloWorld {

	private String name;

	public void setName(String name) {
		System.out.println("Set Method...");
		
		this.name = name;
	}

	public void hello() {
		System.out.println("hello " + name);
	}

	
	public HelloWorld(){
		System.out.println("Constructor....");
	}
}
