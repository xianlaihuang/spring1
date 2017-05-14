package com.howbuy.spring.factorybean;

import org.springframework.beans.factory.FactoryBean;

public class CarFacotryBean implements FactoryBean<Car> {

	private String brand;
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	@Override
	public Car getObject() throws Exception {
		// TODO Auto-generated method stub
		return new Car(brand);
	}

	@Override
	public Class<?> getObjectType() {
		// TODO Auto-generated method stub
		return Car.class;
	}

	@Override
	public boolean isSingleton() {
		// TODO Auto-generated method stub
		return true;
	}


}
