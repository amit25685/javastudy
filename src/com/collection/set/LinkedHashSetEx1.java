package com.collection.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetEx1 {
	public static void main(String aa[]) {
		LinkedHashSet<String> hSet= new LinkedHashSet<String>();
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
