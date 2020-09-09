package com.collection.list.alist;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx3 {
	public static void main(String aa[]) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Ajay");
		list.add("Vinod");
		list.add("Ravi");
		list.add("Joya");
		list.add("Vikash");

		for(String name:list)
			System.out.println(name);
	}
}
