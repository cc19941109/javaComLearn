package com.chen.performance;

import java.util.ArrayList;

public class Normal {
	public static void main(String[] args) {
		int a=2;
		int b= 3;
		int c= 4;
		a = b =c;
		System.out.println(a+b+c);
	}
}
