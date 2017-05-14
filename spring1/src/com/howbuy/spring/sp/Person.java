package com.howbuy.spring.sp;

public class Person {
	private String name;
	private Car car;
	private String street;
	
	private String info;
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", car=" + car + ", street=" + street
				+ ", info=" + info + "]";
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}

}
