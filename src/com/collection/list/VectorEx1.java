package com.collection.list;

import java.util.Iterator;
import java.util.Vector;

public class VectorEx1 {
	public static void main(String aa[]) {
		Vector<String> vector= new Vector<String>();
		vector.add("Joya");
		vector.add("Ravi");
		vector.add("Vevo");
		vector.add("Kaya");
		vector.add("Rito");
		
		Iterator itr = vector.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
