package com.howbuy.spring.sp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("bean-spel.xml");
		/*Address ad = (Address) ctx.getBean("address");
		System.out.println(ad);
		Car car = (Car) ctx.getBean("car");
		System.out.println(car);*/
		Person person =(Person) ctx.getBean("person");
		System.out.println(person);
	}

}
