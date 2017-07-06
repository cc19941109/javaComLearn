package com.chen.dailyAlg;

public class DubArray {
	public static boolean find(int target, int[][] array) {
		int key = 0;
		int flag = 0;
		for (; flag < array.length; flag++) {
			if (target > array[key][key] && key < array.length) {
				key++;
			}
		}
		for (int i = 0; i <= key; i++) {
			if ((array[key][i] == target) || (array[i][key] == target)) {
				System.out.println(array[key][i] + array[i][key]);
				return true;
			}
		}

		return false;
	}

	public static boolean findNo2(int target, int[][] array) {

		int len = array.length - 1;
		int i = 0;
		while ((len >= 0) && (i < array[0].length)) {
			if (array[len][i] > target) {
				len--;
			} else if (array[len][i] < target) {
				i++;
			} else {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[][] a = { { 3, 4, 7, 8 }, { 4, 6, 9, 11 }, { 6, 7, 10, 13 } };
		System.out.println(findNo2(20, a));
		// System.out.println(a.length);
		// System.out.println(a[0].length);

	}

}
