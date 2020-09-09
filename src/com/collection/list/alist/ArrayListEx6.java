package com.collection.list.alist;

import java.util.ArrayList;

class Student{
	int id;
	String name;
	int age;
	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
}
public class ArrayListEx6 {
	public static void main(String aa[]) {
		Student s1=new Student(101,"Sonoo",23);
		Student s2=new Student(102,"Viajay",27);
		Student s3=new Student(103,"Rahul",35);
		Student s4=new Student(104,"Mukesh",87);
		Student s5=new Student(105,"Lokesh",55);
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);

		for(Student stu:list) {
			Student st=(Student)stu;  
			System.out.println("Details of student, name: "+st.name+", age: "+st.age+", id: "+st.id);}
	}
}
