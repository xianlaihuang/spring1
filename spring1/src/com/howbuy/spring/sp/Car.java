package com.howbuy.spring.sp;

public class Car {
	private String brand;
	private double price;
	private double typePer;
	public double getTypePer() {
		return typePer;
	}
	public void setTypePer(double typePer) {
		this.typePer = typePer;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Car [brand=" + brand + ", price=" + price + ", typePer="
				+ typePer + "]";
	}

	public Car() {
		// TODO Auto-generated constructor stub
		
		System.out.println("Car's Constructor . . .");
	}
}
