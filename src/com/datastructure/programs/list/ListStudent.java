package com.datastructure.programs.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ListStudent {

	public static void main(String[] args) {
		
		Student s1=new Student(101,"Sonoo",26);  
		Student s2=new Student(102,"Ravi",21);  
		Student s3=new Student(105,"Hanat",23);
		Student s4=new Student(103,"Hanumat",27);
		Student s5=new Student(108,"jjjanumat",22);
		Student s6=new Student(104,"llllumat",24);
		//Student s7=new Student(144,"llllumat",24);
		
		List<Student> al=new ArrayList<Student>();//creating arraylist  
		  al.add(s1);//adding Student class object  
		  al.add(s2);  
		  al.add(s3);
		  al.add(s4);
		  al.add(s5);
		  al.add(s6);
		  al.add(s4);
		  
		  Iterator<Student> itr=al.iterator();  
		  //traversing elements using foreach of ArrayList object  
		  /*for(Student obj:al){
			  System.out.println(obj.rollno+" "+obj.name+" "+obj.age);
		  }*/
		  
		  System.out.println("ArrayList of Objects with Duplicate");
		  while(itr.hasNext()){  
		    Student st=(Student)itr.next();  
		    System.out.println(st.rollno+" "+st.name+" "+st.age);  
		  }  
		  	  
		  Set<Student> notDuplicate = new LinkedHashSet<Student>(al);
		  al.clear();
		  al.addAll(notDuplicate);
		  
		  System.out.println("=====================");
		  System.out.println("ArrayList of Objects WITHOUT Duplicate");
		  Iterator<Student> itr2=al.iterator();  
		  while(itr2.hasNext()){  
		    Student st=(Student)itr2.next();  
		    System.out.println(st.rollno+" "+st.name+" "+st.age);  
		  } 		
	}
}
