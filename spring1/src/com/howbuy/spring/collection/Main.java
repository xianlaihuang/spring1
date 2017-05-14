package com.howbuy.spring.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationcontext.xml");
		Person person= (Person) ctx.getBean("person3");
		System.out.println(person);
		NewPerson np = (NewPerson) ctx.getBean("newPerson");
		System.out.println(np);
		DataSource ds = (DataSource) ctx.getBean("dataSource");
		System.out.println(ds);
	
	}

}
