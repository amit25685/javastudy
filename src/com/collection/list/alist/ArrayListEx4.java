package com.collection.list.alist;

import java.util.ArrayList;

public class ArrayListEx4 {
	public static void main(String aa[]) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Ajay");
		list.add("Vinod");
		list.add("Ravi");
		list.add("Joya");
		list.add("Vikash");

		System.out.println("Returning Element: "+list.get(1));
		list.set(1, "Rakesh");
		
		for(String name:list)
			System.out.println(name);
	}
}
