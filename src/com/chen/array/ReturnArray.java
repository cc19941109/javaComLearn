package com.chen.array;

class animal{}
class tiger extends animal{}

public class ReturnArray {
	
	public int[] cteateArray(){
		int[] a = {1,3,2};
		return a;
	}
	public static void main(String[] args) {
		int[] a = new ReturnArray().cteateArray();
		System.out.println(a.getClass());//class [I
		System.out.println(a.getClass().getSimpleName());
		System.out.println(a.getClass().getTypeName());
		
		for(int i = 0; i<a.length;i++){
			System.out.println(a[i]);
		}
		tiger[] tigers = {};
		
		
	}
}
