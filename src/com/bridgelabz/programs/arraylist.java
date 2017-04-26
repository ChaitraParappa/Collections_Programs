package com.bridgelabz.programs;

import java.util.ArrayList;
import java.util.Iterator;

public class arraylist {
public static void main(String[] args) {
	ArrayList arraylist=new ArrayList();
	
	arraylist.add("ravi");
	arraylist.add("123");
	arraylist.add("divya");
	arraylist.add("ranjitha");
	arraylist.add("76587");
	
	System.out.println(arraylist);
	
	Iterator itr=arraylist.iterator();
	while(itr.hasNext())
		System.out.println(itr.next());
	
	arraylist.add(3, "dileep");
	
	System.out.println(arraylist);
	
    arraylist.remove("divya");
    
    System.out.println(arraylist);
    
    arraylist.add(new Person("saritha","banglore",741258967));
    
    for(Object object:arraylist)
    {
    	System.out.println(object);
    }
    ArrayList<Person> arraylist1=new ArrayList<Person>();
    arraylist1.add(new Person("sangeeta","pune",56784565));
    arraylist1.add(new Person("geeta","tumkur",784512963));
    arraylist1.add(new Person("nayana","mysore",542178912));
    
   
    
    for(Person person:arraylist1)
    	System.out.println(person.name+" "+person.address+" "+person.phonenumber);
    
	
	
	
}
}
