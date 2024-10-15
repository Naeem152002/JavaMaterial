package com.collection.copy;

import java.util.HashMap;
import java.util.Iterator;

public class Test2 {
	public static void main(String arg[]) {
		HashMap<String, String> hashMap = new HashMap<String, String>();
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
