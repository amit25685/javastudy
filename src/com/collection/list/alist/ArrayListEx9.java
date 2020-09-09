package com.collection.list.alist;

import java.util.ArrayList;

public class ArrayListEx9 {
	public static void main(String aa[]) {
		ArrayList<String> al= new ArrayList<String>();
		al.add("ravi");
		al.add("kishan");
		al.add("raju");
		al.add("kavi");
		al.add("jadhav");
		System.out.println("An initial list of elements: "+al);   
		
		//remove specific element from arraylist
		al.remove("ravi");
		System.out.println("List after removal of elements by value: "+al);
		
		//removing element by id
		al.remove(2);
		System.out.println("List after removal of elements by id: "+al);
		
		ArrayList<String> al2=new ArrayList<String>();    
		al2.add("Ravi");    
		al2.add("Hanumat");   
		
		//Adding new elements to arraylist  
		al.addAll(al2);
		System.out.println("Updated list: "+al);
		
		//Removing all the new elements from arraylist  
		al.removeAll(al2);
		System.out.println("Updated list after removal of al2 : "+al);
		
		//Removing elements on the basis of specified condition  
		al.removeIf(str->str.contains("Ajay"));
		System.out.println("After removal of Ajay: "+al);
		
		al.clear();
		System.out.println("After clear method: "+al);
	}
}
