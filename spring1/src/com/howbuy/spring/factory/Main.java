package com.howbuy.spring.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-staticfactory.xml");
		Car car1 = (Car) ctx.getBean("car2");
		System.out.println(car1);
	
	}

}
