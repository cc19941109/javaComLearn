package com.chen.algorithm.mergeSort;

public class MergeSort {
	/**
	 * 首先，先对两个有序数组进行排序
	 */
	public static int[]  sortOrdered(int[] a, int[] b) {
		int length1 = a.length;
		int length2 = b.length;
		int[] c = new int[length1 + length2];
		int k = 0;
		for (int i = 0, j = 0;;k++) {
			if(i==length1){
				for(;k<c.length;k++){
					c[k] = b[j];
					j++;
				}
				break;
			}
			if(j==length2){
				for(;k<c.length;k++){
					c[k] = b[i];
					i++;
				}
				break;
			}
			if (a[i] > b[j]) {
				c[k] = b[j];
				j++;
			} else {
				c[k] = a[i];
				i++;
			}
			
		}
		return c;
	}

	
	
	public static void main(String[] args) {
		int[] a  = {0,2,3,4,5,7,10};
		int[] b = {1,6,8,9,11};
		int[] c = sortOrdered(a, b);
		for(int i =0;i<c.length;i++){
			System.out.print(c[i]+" ");
		}
	}
}
