package com.chen.niuke;

import java.util.HashSet;

public class CharCompareOfStringBySet {
	public static boolean checkDifferent(String string) {
		// char[] chars = string.toCharArray();
		HashSet<Character> hashSet = new HashSet<>();
		// for(char c :chars)){
		// hashSet.add(c);
		// }

		for (int i = 0; i < string.length(); i++) {
			hashSet.add(string.charAt(i));
		}
		if (hashSet.size() < string.length()) {
			return false;
		}
		return true;
	}

	public static void main(String[] args) {

		String string = "asdhalkfhwoiehnv nxvbiuef";

		System.out.println(checkDifferent(string));
	}
}
