package com.chen.niuke;

public class RecursionFactorial {
	int value = 1;

	public int compute(int key) {

		if (key > 1) {
			value = key * compute(--key);
		}

		return value;

	}

	public static void main(String[] args) {
		for (int i = 1; i <=18; i++) {
			System.out.println(new RecursionFactorial().compute(i));
		}
	}
}
