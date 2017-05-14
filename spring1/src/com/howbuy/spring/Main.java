package com.howbuy.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args){
		/*HelloWorld helloWorld = new HelloWorld();
		helloWorld.setName("xianlai");*/
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationcontext.xml");
		
		/*HelloWorld helloWorld = (HelloWorld) ctx.getBean("helloWorld");
		
		helloWorld.hello();*/
		Person person= (Person) ctx.getBean("person");
		System.out.println(person);
	}

}
