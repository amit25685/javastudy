package com.collection.list.alist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortArrayList {
	public static void main(String aa[]) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Ajay");
		list.add("Vinod");
		list.add("Ravi");
		list.add("Joya");
		list.add("Vikash");

		Collections.sort(list);
		
		for(String name:list)
			System.out.println(name);
		
		List<Integer> list2=new ArrayList<Integer>();  
		list2.add(21);  
		list2.add(11);  
		list2.add(51);  
		list2.add(1);  
		
		Collections.sort(list2);
		
		for(int val: list2)
			System.out.println(val);

	}
}
