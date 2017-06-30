package com.chen.performance;

import java.util.HashSet;
import java.util.Hashtable;

public class PerforSet {
	private HashSet<Integer>  hashSet = new HashSet<>();
	
	private int cap = 100000;
	private int key ;
	public HashSet<Integer> createHashSet(){
		for(int i = 0;i<cap;i++){
			hashSet.add(i);
		}
		return hashSet;
		
	}
	
	public void findHashSet(HashSet<Integer> set){
		for (Integer integer : set) {
			key = integer;
		}
	}
	public static void main(String[] args) {
		PerforSet pp = new PerforSet();
		
		long start11 = System.currentTimeMillis();
		HashSet<Integer> shashSet = pp.createHashSet();
		long end11 = System.currentTimeMillis();
		System.out.println("createHashSet    " + (end11 - start11));
		
		
		
		
		long start2 = System.currentTimeMillis();
		pp.findHashSet(shashSet);
		long end2 = System.currentTimeMillis();
		System.out.println("findHashSet    " + (end2 - start2));
		
		
		
	}
	
}
