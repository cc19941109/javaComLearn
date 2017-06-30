package com.chen.performance;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class PerforFindMap {
	public static void main(String[] args) {

		HashMap<Integer, String> hashMap = new HashMap<>();

		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "a");
		map.put(2, "b");
		map.put(3, "ab");
		map.put(4, "ab");
		map.put(4, "ab");// 和上面相同 ， 会自己筛选
		for(Integer i = 5;i<=500000;i++){
			map.put(i, "a"+i);
		}
		System.out.println("map.size():  "+map.size());
		
		int key;
		String value;
		// 第一种：
		
		System.out.println("第一种：通过Map.keySet遍历key和value：");
		long start1 = System.currentTimeMillis();
		
		for (Integer in : map.keySet()) {
			// map.keySet()返回的是所有key的值
			value = map.get(in);// 得到每个key多对用value的值
			key = in;
		}
		long end1 = System.currentTimeMillis();
		System.out.println((end1 - start1));
		
		// 第二种：
		System.out.println("第二种：通过Map.entrySet使用iterator遍历key和value：");
		Iterator<Map.Entry<Integer, String>> it = map.entrySet().iterator();
		long start2 = System.currentTimeMillis();
		while (it.hasNext()) {
			Map.Entry<Integer, String> entry = it.next();
			key = entry.getKey();
			value = entry.getValue();
			//System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
		}
		long end2 = System.currentTimeMillis();
		System.out.println((end2 - start2));
		
		// 第三种：推荐，尤其是容量大时
		System.out.println("第三种foreach：通过Map.entrySet遍历key和value");
		long start3 = System.currentTimeMillis();
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			// Map.entry<Integer,String> 映射项（键-值对） 有几个方法：用上面的名字entry
			// entry.getKey() ;entry.getValue(); entry.setValue();
			// map.entrySet() 返回此映射中包含的映射关系的 Set视图。
			key = entry.getKey();
			value = entry.getValue();
			
			//System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
		}
		long end3 = System.currentTimeMillis();
		System.out.println((end3 - start3));
		
		// 第四种：
//		System.out.println("第四种：通过Map.values()遍历所有的value，但不能遍历key");
//		for (String v : map.values()) {
//			value = v;
//		}
		
	}

}
