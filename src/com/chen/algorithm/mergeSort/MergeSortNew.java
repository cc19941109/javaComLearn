package com.chen.algorithm.mergeSort;

public class MergeSortNew {

	public static int[] sort(int[] a, int low, int high) {
		int mid = (low + high) / 2;
		if (low < high) {
			sort(a, low, mid);
			sort(a, mid + 1, high);
			sortOrdered(a, low, mid, high);
		}

		return a;
	}

	private static int[] sortOrdered(int[] a, int low, int mid, int high) {
		int[] temp = new int[high - low + 1];
		int i = low;// 左指针
		int j = mid + 1;// 右指针
		int k = 0;

		while (i <= mid && j <= high) {
			if (a[i] < a[j]) {
				temp[k++] = a[i++];
			} else {
				temp[k++] = a[j++];
			}
		}
		while (i <= mid) {
			temp[k++] = a[i++];
		}
		while (j <= high) {
			temp[k++] = a[j++];
		}
		for (int x = 0; x < high - low + 1; x++) {
			a[low + x] = temp[x];
		}

		return a;
	}

	public static void main(String[] args) {
		int[] a = { 9, 8, 7, 3,6, 5, 4, 3, 2, 1 };
		sort(a, 0, a.length-1);
		for (int x : a) {
			System.out.print(x + " ");
		}
	}

}
