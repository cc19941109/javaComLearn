package com.chen.array;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.rmi.Remote;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Queue;
import java.util.RandomAccess;
import java.util.Vector;

public class test implements Cloneable,Serializable,RandomAccess,Remote{
	
	/**
	 * @category 
	 * @author chengchen2
	 * @date Jun 28, 2017
	 * @param
	 */
	private static final long serialVersionUID = 8248232139756156899L;

	public static void main(String[] args) {
		HashMap<String, String> hashMap = new HashMap<>();
		System.out.println(hashMap.size());
		System.out.println();
		test sTest = new test();
		
		//Vector<E>
	}
}
