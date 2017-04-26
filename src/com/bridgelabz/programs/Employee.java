package com.bridgelabz.programs;

public class Employee {
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + "]";
	}

	String name;
	int id;
	static int h=0;
	
	public Employee(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	@Override
	public int hashCode() {
		return h++;
	}
	
	

}
