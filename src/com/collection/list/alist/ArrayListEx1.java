package com.collection.list.alist;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx1 {
	public static void main(String aa[]) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Ajay");
		list.add("Vinod");
		list.add("Ravi");
		list.add("Joya");
		list.add("Vikash");

		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
