package com.howbuy.spring.factory;

import java.util.HashMap;
import java.util.Map;

import javax.print.attribute.HashAttributeSet;

/**
 * 静态工厂方法
 * @author xianlai.huang
 *
 */
public class StaticCarFactory {
	private static Map<String,Car> cars = new HashMap<String, Car>();
	static{
		cars.put("audi", new Car("bmw"));
		cars.put("ford", new Car("ford"));

	}
	//静态工厂方法
	public static Car getCar(String name){
		return cars.get(name);
	}

}
