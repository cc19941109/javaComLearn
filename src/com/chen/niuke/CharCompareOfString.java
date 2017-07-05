package com.chen.niuke;

/**
 * 请实现一个算法，确定一个字符串的所有字符是否全都不同。这里我们要求不允许使用额外的存储结构。 给定一个string
 * iniString，请返回一个bool值,True代表所有字符全都不同，False代表存在相同的字符。保证字符串中的字符为ASCII字符。字符串的长度小于等于3000。
 * 运行时间：46ms
 * 占用内存：9944k
 * @category @author chengchen2
 * @date Jul 5, 2017
 * @param
 */
public class CharCompareOfString {

	public static  void print(char[] a){
		
		for(char is:a){
			System.out.print(is+",");
		}
		System.out.println();	
	}
	public static int part(char[] chars, int first, int end) {

		char key = chars[first];

		while (first < end) {
			while (first < end && chars[end] >= key) {
				end--;
			}
			chars[first] = chars[end];
			while (first < end && chars[first] <= key) {
				first++;
			}
			chars[end] = chars[first];
			//print(chars);
		}

		chars[first] = key;
		
		return first;
	}

	public static void quickSort(char[] chars, int first, int end) {
		if(first>=end){
			return;
		}
		int key = part(chars, first, end);
		quickSort(chars, first, key - 1);
		quickSort(chars, key + 1, end);

	}

	public static boolean checkDifferent(String string) {
		char[] chars = string.toCharArray();
		quickSort(chars, 0, chars.length-1);
		for (int i = 0; i < chars.length - 1; i++) {
			if (chars[i] == chars[i + 1]) {
				return true;
			}
		}

		return false;
	}

	public static void main(String[] args) {

		String string = "asdhalkfhwoiehnv nxvbiuef";

		System.out.println(checkDifferent(string));
	}
}
