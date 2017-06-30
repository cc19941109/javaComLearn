package com.chen.performance;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class PerforAddMap {

	private HashMap<Integer, String> hashMap = new HashMap<>();
	private TreeMap<Integer, String> treeMap = new TreeMap<>();
	private Hashtable<Integer, String> hashtable = new Hashtable<>();

	private int _capicity = 1000000;
	private int key;
	private String value;


	public HashMap<Integer, String> perHashMapAdd() {
		for (int i = 0; i < _capicity; i++) {
			hashMap.put(i, "a");
		}
		return hashMap;
	}

	public TreeMap<Integer, String> perTreeMapAdd() {
		for (int i = 0; i < _capicity; i++) {
			treeMap.put(i, "a");
		}
		return treeMap;
	}

	public Hashtable<Integer, String> perAddHashTable() {
		for (int i = 0; i < _capicity; i++) {
			hashtable.put(i, "a");
		}
		return hashtable;
	}

	public void findHashMap(HashMap<Integer, String> hashMap) {
		for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
			key = entry.getKey();
			value = entry.getValue();

		}
	}

	public void findTreeMap(TreeMap<Integer, String> treeMap) {
		for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
			key = entry.getKey();
			value = entry.getValue();

		}
	}
	
	public void findHashTable(Hashtable<Integer, String> hashtable) {
		for (Map.Entry<Integer, String> entry : hashtable.entrySet()) {
			key = entry.getKey();
			value = entry.getValue();

		}
	}

	public static void main(String[] args) {
		PerforAddMap pp = new PerforAddMap();

		long start = System.currentTimeMillis();
		HashMap<Integer, String> hashMap = pp.perHashMapAdd();
		long end = System.currentTimeMillis();
		System.out.println("perHashMapAdd   " + (end - start));

		long start1 = System.currentTimeMillis();
		TreeMap<Integer, String> treeMap = pp.perTreeMapAdd();
		long end1 = System.currentTimeMillis();
		System.out.println("perTreeMapAdd    " + (end1 - start1));

		long start11 = System.currentTimeMillis();
		Hashtable<Integer, String> hashtable = pp.perAddHashTable();
		long end11 = System.currentTimeMillis();
		System.out.println("perAddHashTable    " + (end11 - start11));

		
		
		long start2 = System.currentTimeMillis();
		pp.findHashMap(hashMap);
		long end2 = System.currentTimeMillis();
		System.out.println("hashMap    " + (end2 - start2));

		long start3 = System.currentTimeMillis();
		pp.findTreeMap(treeMap);
		long end3 = System.currentTimeMillis();
		System.out.println("treeMap     " + (end3 - start3));
		
		long start33 = System.currentTimeMillis();
		pp.findHashTable(hashtable);
		long end33 = System.currentTimeMillis();
		System.out.println("findHashTable     " + (end33 - start33));

	}
}
