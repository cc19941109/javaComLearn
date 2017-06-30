package com.chen.algorithm;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

class PBag{
	private int age  = 10;
	private void get(){
		System.out.println("get");
	}
}

public class afadf {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalArgumentException, IllegalAccessException {
//		Integer i = new Integer(1);
//		i.getClass().getMethod("v", Integer.class);
		Method[] methods = new PBag().getClass().getMethods();
		for (Method method : methods) {
			System.out.println(method.getName());
		}
		System.out.println("------------------------");
		PBag pBag = new PBag();
		
		Field[] fields = new PBag().getClass().getFields();
		Method[] declaredMethods = new PBag().getClass().getDeclaredMethods();
		Field[] declaredFields = pBag.getClass().getDeclaredFields();
		for (Field field : declaredFields) {
			System.out.println(field.get(pBag));
		}
		
		for (Method method : declaredMethods) {
			System.out.println(method.getName());
		}
	}
}
