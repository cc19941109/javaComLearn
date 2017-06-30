package com.chen.reflect;

public class ClassTest<T> {
	public static void main(String[] args) {
		ClassTest classTest = new ClassTest<>();
		Class class1 = classTest.getClass();
		System.out.println(class1.getTypeName());
		System.out.println(class1.getTypeParameters());
		System.out.println(class1.getSuperclass());
		System.out.println();
	}
}
