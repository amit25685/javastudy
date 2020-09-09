package com.collection.list;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueEx1 {
	public static void main(String aa[]) {
		PriorityQueue<String> pQueue= new PriorityQueue<String>();
		pQueue.add("Amit Sharma");
		pQueue.add("Vijay Raj");
		pQueue.add("JaiShankar");
		pQueue.add("Raj");
		pQueue.add("Purohit");
		
		System.out.println("Head Element : "+pQueue.element());
		System.out.println("Head Element : "+pQueue.peek());
		System.out.println("Iterating Queue Element");
		
		Iterator itr= pQueue.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		pQueue.remove();
		pQueue.poll();
		System.out.println("After removing 2 Queue Element");
		
		Iterator<String> itr1= pQueue.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}		
	}
}
