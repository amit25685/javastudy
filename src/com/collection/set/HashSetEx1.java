package com.collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx1 {
	public static void main(String aa[]) {
		HashSet<String> hSet= new HashSet<String>();
		hSet.add("Ravi");
		hSet.add("Vijay");
		hSet.add("Manoj");
		hSet.add("Ranju");
		hSet.add("Vijay");
		hSet.add("Ranju");
		
		Iterator<String> itr= hSet.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
