package com.chen.performance;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class PerforAddMap {

	private HashMap<Integer, String> hashMap = new HashMap<>();
	private TreeMap<Integer, String> treeMap = new TreeMap<>();
	private Hashtable<Integer, String> hashtable = new Hashtable<>();
	private HashSet<Integer> hashSet = new HashSet<>();
	private TreeSet<Integer> treeSet = new TreeSet<>();

	private int _capicity = 2000000;
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

	public HashSet<Integer> createHashSet() {
		for (int i = 0; i < _capicity; i++) {
			hashSet.add(i);
		}
		return hashSet;

	}

	public TreeSet<Integer> createTreeSet() {
		for (int i = 0; i < _capicity; i++) {
			treeSet.add(i);
		}
		return treeSet;

	}

	public void findHashSet(HashSet<Integer> set) {
		for (Integer integer : set) {
			key = integer;
		}
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

	public void findTreeSet(TreeSet<Integer> treeSet) {
		for (Integer integer : treeSet) {
			key = integer;
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

		long start111 = System.currentTimeMillis();
		HashSet<Integer> shashSet = pp.createHashSet();
		long end111 = System.currentTimeMillis();
		System.out.println("createHashSet    " + (end111 - start111));

		long start1110 = System.currentTimeMillis();
		TreeSet<Integer> treeSet = pp.createTreeSet();
		long end1110 = System.currentTimeMillis();
		System.out.println("createTreeSet    " + (end1110 - start1110));

		System.out.println("------------------------------------------------------------");
		
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

		long start21 = System.currentTimeMillis();
		pp.findHashSet(shashSet);
		long end21 = System.currentTimeMillis();
		System.out.println("findHashSet    " + (end21 - start21));

		long start212 = System.currentTimeMillis();
		pp.findTreeSet(treeSet);
		long end212 = System.currentTimeMillis();
		System.out.println("findTreeSet    " + (end212 - start212));

	}
}
