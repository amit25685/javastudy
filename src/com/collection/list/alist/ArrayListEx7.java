package com.collection.list.alist;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ArrayListEx7 {
	public static void main(String aa[]) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Ravi");
		al.add("Vijay");
		al.add("Kishore");
		al.add("Vinay");
		al.add("Rekha");
		
		try {
			FileOutputStream fos= new FileOutputStream("file");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(al);
			fos.close();
			oos.close();
			
			FileInputStream fis = new FileInputStream("file");
			ObjectInputStream ois = new ObjectInputStream(fis);
			ArrayList alist = (ArrayList) ois.readObject();
			System.out.println(alist);			
		}catch(Exception ex) {
			System.out.println(ex);
		}
	}
}
