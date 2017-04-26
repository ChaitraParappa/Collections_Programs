package com.bridgelabz.programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;

class ExLinkedHashSet {
	public static void main(String[] args) {
		LinkedHashSet<Student> linkedhashset = new LinkedHashSet<Student>();

		linkedhashset.add(new Student(102, "kiran", 2, "AIT"));
		linkedhashset.add(new Student(108, "Rajesh", 8, "SIT"));
		linkedhashset.add(new Student(104, "Kumar", 5, "KIT"));
		linkedhashset.add(new Student(103, "Girish", 3, "SSIT"));

		for (Student student : linkedhashset) {
			System.out.println(student.usn + " " + student.name + " "
					+ student.semester + " " + student.college);
		}
		System.out.println("");

		ArrayList arraylist = new ArrayList(linkedhashset);

		Collections.sort(arraylist, new Student.orderBySemester());

		Iterator itr = arraylist.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}
}
