package com.chen.algorithm.stack;

public class TestStack {
	public static void main(String[] args) {
		Stack stack =new Stack(10);
		stack.push(1);
		stack.push(341);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());

	}
}
