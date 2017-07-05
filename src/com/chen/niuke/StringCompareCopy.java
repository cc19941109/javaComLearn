package com.chen.niuke;

public abstract class StringCompareCopy {
	 public boolean checkDifferent(String str) {
	        // write code here
	          // 1. 假定 null 字符串返回 true
	        // 2. 长度 > 256 则必定存在相同字符
	        if (str == null || str.length() > 256)
	            return false;
	 
	        // appear 数组标记某个字符是否出现过, false 为未出现, true 为出现过
	        boolean[] appear = new boolean[256];
	 
	        for (int i = 0; i < str.length(); i++) {
	            int index = str.charAt(i);
	            if (appear[index] == true) {    // 出现过
	                return false;
	            }
	 
	            appear[index] = true;   // 第一次出现, 在 appear 中标记为已经出现
	        }
	 
	        return true;
	    }
	 public static void main(String[] args) {
		String string = "abc";
		int x = string.charAt(1);
		System.out.println(x+string.charAt(1));
	}
}
