package com.chen.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import com.sun.org.apache.xpath.internal.operations.Number;

public class MapHashcode {
	
	Map<Integer, String> map =new HashMap<>();
    public int hashCode() {
    	
    	map.put(5, "3");
    	map.put(6, "8");
    	map.put(7, "6");
    	
    	int h = 0;
        Iterator<Entry<Integer, String>> i = map.entrySet().iterator();
        while (i.hasNext())
            h += i.next().hashCode();
        System.out.println(h);
        return h;
    }
    
    public static void main(String[] args) {
    	
    	MapHashcode mc = new MapHashcode();
    	int h = mc.hashCode();
    	System.out.println("3".hashCode());
    	System.out.println("8".hashCode());
    	System.out.println(mc.map.hashCode());
    	
    	
    	
	}
    
}
