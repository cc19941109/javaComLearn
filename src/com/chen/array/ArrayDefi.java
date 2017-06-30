package com.chen.array;

import java.security.AuthProvider;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.Vector;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

import javax.security.auth.Subject;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.login.LoginException;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class ArrayDefi {
	public static void main(String[] args) {
		int[] ints = new int[10];
		System.out.println(ints.getClass().isArray());
		System.out.println(ints.getClass().getName());
		LinkedList<String> sList = new LinkedList<>();
		
		List<String> list = new ArrayList<>();
		//list.containsAll(c);
		//list.clone();
		ArrayList<String> list2 = new ArrayList<>();
		//list2.containsAll()
		list2.clone();
		
		ArrayBlockingQueue a  = new ArrayBlockingQueue<>(3);
		
		BlockingDeque<String> bDeque = new LinkedBlockingDeque<>();
		
		BlockingQueue<String> bQueue = new ArrayBlockingQueue<>(10);
		
		ArrayDeque<String> deque  =  new ArrayDeque<>(); 
		Deque<String> nDeque = new ArrayDeque<>();
		TreeSet<String> treeSet = new TreeSet<>();
		HashSet<String> hashSet = new HashSet<>();
		Vector<String> vector =  new Vector<>();
		
		HashSet<String> hashSet2 = new HashSet<>();
		//Map<K, V>
		 //AuthProvider au = new AuthProvider() {};
		HashMap<String,String> hashMap = new HashMap<>();
		Hashtable<String, String> hashtable = new Hashtable<>();
		hashMap.getClass().hashCode();
	//	TransferQueue<E>
		//Arrays.sort(a);
		Object object = new Object();
	}
}
