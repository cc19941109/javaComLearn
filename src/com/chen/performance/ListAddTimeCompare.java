package com.chen.performance;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListAddTimeCompare {
	public static void main(String[] args) {
		/**
		 * Arraylist 性能测试
		 */

		
		ArrayList<Integer> arrayList = new ArrayList<>();
		//int[] arrayTime = new int[100];

		System.out.println("----Arraylist add 性能测试----");
		long start1 = System.currentTimeMillis();
		long end1;
		for (int i = 0; i < 10000000; i++) {
			arrayList.add(i);
		}
		end1 = System.currentTimeMillis();
		System.out.println("Arraylist  add :" + (end1 - start1));

		/**
		 * LinkedList 性能测试
		 */
		System.out.println("----LinkedList add 性能测试----");
		LinkedList<Integer> linkedList = new LinkedList<>();
		long start2 = System.currentTimeMillis();
		for (int i = 0; i < 10000000; i++) {
			linkedList.add(i);
		}
		long end2 = System.currentTimeMillis();
		System.out.println("LinkedList  add :" + (end2 - start2));
		
		
	}
}
