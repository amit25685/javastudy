package com.collection.list;

import java.util.Iterator;
import java.util.Stack;

public class StackEx1 {
	public static void main(String aa[]) {
		Stack<String> stack = new Stack<String>();
		stack.push("Java");
		stack.push("Java script");
		stack.push("Python");
		stack.push("PHP");
		stack.push(".Net");
		stack.pop();
		
		Iterator<String> str= stack.iterator();
		while(str.hasNext()) {
			System.out.println(str.next());
		}		
	}
}
