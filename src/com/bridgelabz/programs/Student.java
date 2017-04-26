package com.bridgelabz.programs;

import java.util.Comparator;

public class Student {
	/*
	 * public static class orderBySemester implements Comparator<Student> {
	 * public int compare(Student student1,Student student2) { return
	 * student1.semester-student2.semester; }
	 * 
	 * }
	 * 
	 * public static class orderbyusn implements Comparator<Student> {
	 * 
	 * public int compare(Student o1,Student o2) { int usn1=o1.usn; int
	 * usn2=o2.usn; return usn1-usn2;
	 * 
	 * }
	 * 
	 * }
	 */

	int usn;
	String name;
	int semester;
	String college;
	int h = 0;

	public Student(int usn, String name, int semester, String college) {
		this.usn = usn;
		this.name = name;
		this.semester = semester;
		this.college = college;
	}

	@Override
	public String toString() {
		return "Student [usn=" + usn + ", name=" + name + ", semester="
				+ semester + ", college=" + college + "]";
	}

	@Override
	public int hashCode() {
		return h++;
	}

	@Override
	public boolean equals(Object obj) {

		if (!(obj instanceof Student))
			return false;

		Student s = (Student) obj;

		return usn == (s.usn) && name.equals(s.name) && semester == s.semester
				&& college.equals(s.college);

	}

}
