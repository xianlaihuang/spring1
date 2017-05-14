package com.howbuy.spring.relation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.howbuy.spring.autowire.Address;
import com.howbuy.spring.autowire.Person;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx= new ClassPathXmlApplicationContext("bean-relation.xml");
		/*Address ad = (Address) ctx.getBean("address1");
		System.out.println(ad);*/

		Address ad = (Address) ctx.getBean("address2");
		System.out.println(ad);	
		
		Person person = (Person) ctx.getBean("person");
		System.out.println(person);
	}

}
