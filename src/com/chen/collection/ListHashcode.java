package com.chen.collection;

import java.util.ArrayList;

public class ListHashcode {
	public static void main(String[] args) {
	/*	ArrayList<String> arrayList = new ArrayList<>();
		System.out.println(arrayList.hashCode());
		arrayList.add("1");
		System.out.println(arrayList.hashCode());
		System.out.println("1".hashCode());
		arrayList.add("1");
		System.out.println(arrayList.hashCode());
		arrayList.add("1");
		System.out.println(arrayList.hashCode());*/
//		System.out.println(Integer.MAX_VALUE);
//
//		System.out.println(Integer.MAX_VALUE);
		
		int a = 0;
		long start = System.currentTimeMillis();
		for(int i= 1;i<100000000;i++){
			a=i*3;
		}
		
		long end = System.currentTimeMillis();
		System.out.println(end-start);
		long start1 = System.currentTimeMillis();
		for(int i= 1;i<100000000;i++){
			a=i<<2;
		}
		long end1 = System.currentTimeMillis();
		System.out.println(end1-start1);

		//int 计算比 long   快
		
	}
}
