package com.chen.algorithm;

public class QuickSort {
	
	public static  void print(int[] a){
		
		for(int is:a){
			System.out.print(is+",");
		}
		System.out.println();	
	}
	
	public static int part(int[] a,int low ,int high){

		int key = a[low];
		while(low<high){
			while(key < a[high]&&low<high){
				high--;
			}
			a[low] = a[high];
			print(a);
			while(key >= a[low]&&low<high){
				low++;
			}
			a[high] = a[low];
			print(a);
		}
		a[low] = key;
		print(a);
		return low;
	}
	
	public static void sort(int[] a,int low,int high){
		//low >= high
		if(low>=high){
			return;
		}
		int index = part(a, low, high);
		sort(a, low, index-1);
		sort(a, index+1, high);
	}
	
	public static void main(String[] args) {
		int[] a = {3,3,4,2,1,2};
		sort(a, 0, a.length-1);
		
	}
	
	
}