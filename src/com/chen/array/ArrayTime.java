package com.chen.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ArrayTime {
	public static final int N = 50000;

	public static List values;

	static {
		Integer vals[] = new Integer[N];

		Random r = new Random();

		for (int i = 0, currval = 0; i < N; i++) {
			vals[i] = new Integer(currval);
			currval += r.nextInt(100) + 1;
		}

		values = Arrays.asList(vals);
	}

	static long timeList(List lst) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < N; i++) {
			int index = Collections.binarySearch(lst, values.get(i));
			if (index != i)
				System.out.println("***错误***");
		}
		return System.currentTimeMillis() - start;
	}

	public static void main(String args[]) {
		System.out.println("ArrayList  消耗时间：" + timeList(new ArrayList(values)));
		System.out.println("LinkedList 消耗时间：" + timeList(new LinkedList(values)));
	}
}
