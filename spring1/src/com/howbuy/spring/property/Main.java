package com.howbuy.spring.property;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.howbuy.spring.autowire.Car;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-properties.xml");
		Car car= (Car) ctx.getBean("car");
		System.out.println(car);
	
	}

}
