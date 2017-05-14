package com.howbuy.spring.collection;

import java.util.List;

import com.howbuy.spring.Car;

public class Person {
	
	private String name;
	private int age;
	public List<Car> getCar() {
		return car;
	}
	public void setCar(List<Car> car) {
		this.car = car;
	}
	private List<Car> car;
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", car=" + car + "]";
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}


}
