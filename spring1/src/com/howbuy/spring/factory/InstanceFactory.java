package com.howbuy.spring.factory;

import java.util.HashMap;
import java.util.Map;
/**
 * 实例工厂方法
 * @author xianlai.huang
 *
 */
public class InstanceFactory {
	private Map<String,Car> cars = null;
	public InstanceFactory(){
		cars = new HashMap<String,Car>();
		cars.put("audi", new Car("BMW"));
		cars.put("ford", new Car("audi"));

	}
	
	public Car getCar(String brand){
		return cars.get(brand);
	}

}
