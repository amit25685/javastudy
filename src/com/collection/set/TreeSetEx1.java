package com.collection.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetEx1 {
	public static void main(String aa[]) {
		TreeSet<String> tSet= new TreeSet<String>(); 
		
		tSet.add("Tea");
		tSet.add("Coffee");
		tSet.add("Milk");
		tSet.add("Jal");
		tSet.add("Juice");
		
		Iterator<String> itr= tSet.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
