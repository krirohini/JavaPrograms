package com.datastructure.programs.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListStudent {

	public static void main(String[] args) {
		
		Student s1=new Student(101,"Sonoo",26);  
		Student s2=new Student(102,"Ravi",21);  
		Student s3=new Student(105,"Hanat",23);
		Student s4=new Student(103,"Hanumat",27);
		Student s5=new Student(108,"jjjanumat",22);
		Student s6=new Student(104,"llllumat",24);
		Student s7=new Student(104,"llllumat",24);
		
		List<Student> linkedListStudent = new LinkedList<>();  
		linkedListStudent.add(s1);//adding Student class object  
		linkedListStudent.add(s2);  
		linkedListStudent.add(s3);
		linkedListStudent.add(s4);
		linkedListStudent.add(s5);
		linkedListStudent.add(s6);
		linkedListStudent.add(s4);
		
		Iterator<Student> itr=linkedListStudent.iterator();
		while(itr.hasNext()){
			Student st=(Student)itr.next();  
		    System.out.println(st.rollno+" "+st.name+" "+st.age);
		}
		
		System.out.println("Size of the linked List  "+linkedListStudent.size());
		System.out.println("Index of the object  is  "+linkedListStudent.indexOf(s3));
		//System.out.println(" of the linked List  "+linkedListStudent.get(4));
		System.out.println("isEmpty() of the linked List  "+linkedListStudent.isEmpty());
		//System.out.println("Size of the linked List  "+linkedListStudent.listIterator());
		
		// TODO Auto-generated method stub

	}

}
