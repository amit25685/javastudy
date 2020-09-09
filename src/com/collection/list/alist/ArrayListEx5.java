package com.collection.list.alist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListEx5 {
	public static void main(String aa[]) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Ajay");
		list.add("Vinod");
		list.add("Ravi");
		list.add("Joya");
		list.add("Vikash");

		System.out.println("Traversing list through List Iterator:");  
		// Traversing through listiterator
		ListIterator<String> list1 = list.listIterator(list.size());
		while(list1.hasPrevious()) {
			String str1= list1.previous();
			System.out.println(str1);
		}
		
		// Traversing through for loop
		System.out.println("Traversing list through for loop:");  
		for(int i=0;i<list.size();i++)  
		{  
			System.out.println(list.get(i));     
		}  
		
		//Traversing through forEach method
		list.forEach(a->{
			System.out.println(a);
			}
		);
		
		System.out.println("Traversing list through forEachRemaining() method:");  
		Iterator<String> itr= list.iterator();
		itr.forEachRemaining(a->{System.out.println(a);});
	}
}
