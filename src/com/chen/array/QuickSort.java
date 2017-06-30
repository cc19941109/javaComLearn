package com.chen.array;

import java.util.Arrays;

public class QuickSort {
	public static int partition(int[] array, int lo, int hi) {
		// 固定的切分方式
		int key = array[lo];
		System.out.println(key);
		while (lo < hi) {
			while (array[hi] >= key && hi > lo) {
				// 从后半部分向前扫描
				hi--;
			}
			array[lo] = array[hi];
			while (array[lo] <= key && hi > lo) {
				// 从前半部分向后扫描
				lo++;
			}
			array[hi] = array[lo];
		}
		array[hi] = key;
		return hi;
	}

	public static void sort(int[] array, int lo, int hi) {
		if (lo >= hi) {
			return;
		}
		int index = partition(array, lo, hi);
		
		for(int x :array){
			System.out.print(x+",");
		}
		System.out.println();
		sort(array, lo, index - 1);
		sort(array, index + 1, hi);
	}

	public static void main(String[] args) {
		
		int[] a = new int[]{23,12,34,5,67,76,56,24,15};
		for(int x :a){
			System.out.print(x+",");
		}
		System.out.println();
		sort(a, 0, 8);
	}

}
