package com.chen.performance;

import java.util.ArrayList;

public class Normal {
	public static void main(String[] args) {

		System.out.println("abdfaf".hashCode());
		System.out.println("abdfaf".hashCode());
		System.out.println(new String("abdfaf").hashCode());
		
		System.out.println("a143bdfaf".hashCode());

		System.out.println("abdf32414af".hashCode());
		System.out.println("ab13414dfaf".hashCode());
		System.out.println(new ArrayList<>().hashCode());
		
		System.out.println(new Object().hashCode());
		System.out.println(new Object().hashCode());
		
		
		
	}
}
