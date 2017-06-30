package com.chen.performance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestArray {
	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		for(int i = 1;i<11;i++){
			arrayList.add(i);
		}
		List<Integer> list2 = arrayList.subList(2, 5);
		
		for(int i:list2){
			System.out.println(i);
		}
		list2.addAll(Arrays.asList(4,2,1,4));
		
		for(int i:arrayList){
			System.out.print(i+",");
		}
		System.out.println();
		for(int i:list2){
			System.out.print(i+",");
		}
		
	}
}
