package com.bridgelabz.programs;

import java.util.Iterator;
import java.util.LinkedList;

class ExLinkedList {
	public static void main(String[] args) {
		LinkedList linkedlist = new LinkedList();

		linkedlist.add("Divya");
		linkedlist.add("suraj");
		linkedlist.add("Sharath");
		System.out.println(linkedlist);
		System.out.println("");

		Iterator itr = linkedlist.iterator();
		while (itr.hasNext())
			System.out.println(itr.next());
		System.out.println("");

		LinkedList linkedlist1 = new LinkedList();
		linkedlist1.add("naveen");
		linkedlist.addAll(linkedlist1);

		System.out.println(linkedlist);
		System.out.println("");
		
		LinkedList<Student> linkedlist2=new LinkedList<Student>();
		
		linkedlist2.add(new Student(123,"Anjali",2,"CIT"));
		linkedlist2.add(new Student(124,"Rashmi",3,"KIT"));
		linkedlist2.add(new Student(125,"Rajini",4,"SSIT"));
		linkedlist2.add(new Student(126,"Shashank",2,"MIT"));
		
		for(Student student:linkedlist2){
			System.out.print(student.usn+" "+student.name+" "+student.semester+" "+student.college);
			System.out.println("");
		}
			

	}

}
