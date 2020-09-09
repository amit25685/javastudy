package com.collection.list;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class DqueueEx1 {
	public static void main(String aa[]) {
		Deque<String> dQue= new ArrayDeque<String>();
		dQue.add("Gautam");
		dQue.add("Karan");
		dQue.add("Ajay");
		
		Iterator<String> itr = dQue.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//or		
		for(String str: dQue){
			System.out.println(str);
		}
	}
}
