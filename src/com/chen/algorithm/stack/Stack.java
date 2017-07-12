package com.chen.algorithm.stack;

public class Stack {
	private int[] data;
	private int size;
	private int top = 0; // 指向栈的顶部

	public Stack(int size) {
		this.size = size;
		this.data = new int[size];
	}

	public void push(int num) {
		if (top < size)
			data[top++] = num;
		else
			System.err.println("Your stack overflow");
	}

	public Integer pop() {
		if (top > 0)
			return data[--top];
		else
			System.err.println("Your stack is empty");
		return null;

	}

	public Integer getTop() {
		if (top > 0) {
			return data[top - 1];
		} else {
			System.err.println("Your stack is empty");
			return null;
		}
	}

	public boolean isEmpty() {
		return top == 0;
	}

}
