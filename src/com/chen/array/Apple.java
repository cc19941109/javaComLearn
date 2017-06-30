package com.chen.array;

import java.util.ArrayList;

interface Iperson{
	void speak();
}

interface Iplay{
	void play();
}
class Father implements Iperson{
	int age = 40;
	int sex = 1;
	public void speak(){
		System.out.println("father");
	}
}
class Son extends Father implements Iplay{
	int age = 20;
	int sex = 1;
	public void speak(){
		System.out.println("son");
		
	}
	public void play(){
		System.out.println("play");
	}
}
class GrandSon extends Son{
	
}

public class Apple {
	public static void main(String[] args) {
		Father man = new Son();
		man.speak();
		Father man1 = new Son();
		/**
		 * 右边方法，左边属性
		 * 属性不能被重写
		 */
		
		System.out.println("man1.age: "+man1.age);
		
		ArrayList<Son> sons = new ArrayList<>();
		ArrayList<? extends Father> father = new ArrayList<>();
		//father.add(0, new Father());
		//father.get(0);
		
		
		
		
	}
}
