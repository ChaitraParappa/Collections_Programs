package com.bridgelabz.programs;

public class Person {
	String name;
	String address;
	long phonenumber;
	public Person(String name, String address, long phonenumber) {
		this.name = name;
		this.address = address;
		this.phonenumber = phonenumber;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address
				+ ", phonenumber=" + phonenumber + "]";
	}
	
	

}
