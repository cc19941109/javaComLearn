package com.chen.dailyAlg;

public class ReplaceSpace {
    public static String replaceSpace(StringBuffer str) {
    	for(int i = 0;i<str.length();i++){
    		if(str.charAt(i)==' '){
    			str.replace(i, i+1, "----");
    		}
    	}
    	
    	
    	return str.toString();	
    }
    public static void main(String[] args) {
    	StringBuffer stringBuffer =new StringBuffer("akdfa ha adfl hasfh");
    	
    	replaceSpace(stringBuffer);
    	System.out.println(stringBuffer);
	}
}

