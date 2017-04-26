package com.bridgelabz.programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;

class ExHashSet {
	public static void main(String[] args) {
		HashSet hashset = new HashSet();

		hashset.add("203");
		hashset.add("suresh");
		hashset.add("6758");
		hashset.add("vinay");
		hashset.add("suresh");

		System.out.println(hashset);
		System.out.println("");

		HashSet<Student> hashset1 = new HashSet<Student>();
		Student s1 = new Student(147, "sanjana", 3, "SIT");

		hashset1.add(s1);
		hashset1.add(s1);
		hashset1.add(new Student(146, "sonu", 7, "CIT"));
		hashset1.add(new Student(1411, "kruthi", 1, "JIT"));
		hashset1.add(new Student(146, "sheela", 2, "RIT"));
		for (Student student : hashset1) {
			System.out.println(student.usn + " " + student.name + " "
					+ student.semester + " " + student.college);
		}

	}

}
