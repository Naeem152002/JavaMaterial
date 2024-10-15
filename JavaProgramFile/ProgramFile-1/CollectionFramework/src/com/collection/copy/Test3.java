package com.collection.copy;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class Test3 {
	public static void main(String arg[]) {
		ConcurrentHashMap<String, String> hashMap = new ConcurrentHashMap<String, String>();
		hashMap.put("Apple", "iPhone");
		hashMap.put("HTC", "HTC one");
		hashMap.put("Samsung","S5");
		Iterator iterator = hashMap.keySet().iterator();
	    
		while (iterator.hasNext()){
			hashMap.put("Sony", "Xperia Z"); 
	    	System.out.println(hashMap.get(iterator.next()));
         }
		
		
	    
	    
	}
}
