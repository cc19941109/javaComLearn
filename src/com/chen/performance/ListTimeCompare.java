package com.chen.performance;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class ListTimeCompare {

	public void forTest(List<Integer> x) {
		int data;
		for (int i = 0; i < x.size(); i++) {
			data = x.get(i);
		}
	}

	public void foreachTest(List<Integer> x) {
		int data;
		for (int a : x) {
			data = a;
		}
	}

	public static void main(String[] args) {

		/**
		 * Arraylist  性能测试
		 */
		ArrayList<Integer> arrayList = new ArrayList<>();
		for (int i = 0; i < 20000000; i++) {
			arrayList.add(i);
		}
		ListTimeCompare test = new ListTimeCompare();
		System.out.println("----Arraylist  性能测试----容量："+arrayList.size());
		long start = System.currentTimeMillis();
		test.foreachTest(arrayList);
		long end = System.currentTimeMillis();
		System.out.println("foreachTest:   "+(end - start));

		long start1 = System.currentTimeMillis();
		test.forTest(arrayList);
		long end1 = System.currentTimeMillis();
		System.out.println("forTest:    "+(end1 - start1));

		/**
		 * LinkedList 性能测试
		 */
		LinkedList<Integer> linkedList = new LinkedList<>();
		linkedList.addAll(arrayList);
		
		System.out.println("----LinkedList 性能测试----容量："+linkedList.size());
	

		long start2 = System.currentTimeMillis();
		test.foreachTest(linkedList);
		long end2 = System.currentTimeMillis();
		System.out.println("foreachTest:  "+(end2 - start2));

//		long start3 = System.currentTimeMillis();
//		test.forTest(linkedList);
//		long end3 = System.currentTimeMillis();
//		System.out.println("forTest:    "+(end3 - start3));

		
	}
}
