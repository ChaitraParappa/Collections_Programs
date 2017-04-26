package com.bridgelabz.programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class ExTreeSet {
	public static void main(String[] args) {
		TreeSet<String> treeset=new TreeSet<String>();
		
		treeset.add("zebra");
		treeset.add("yalk");
		treeset.add("cat");
		treeset.add("fox");
		treeset.add("elephant");
		treeset.add("tiger");
		treeset.add("lion");
		
		
		Iterator<String> itr=treeset.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		TreeSet<Animals> treeset1=new TreeSet<Animals>();
		
		
		treeset1.add(new Animals("amphibians","vertibrates",7302));
		treeset1.add(new Animals("Insects","Invertebrates",100000));
		treeset1.add(new Animals("Reptiles","vertibrates",10302));
		treeset1.add(new Animals("Birds","vertibrates",10425));
		treeset1.add(new Animals("Molluscs	","Invertebrates",85000));
		treeset1.add(new Animals("amphibians","vertibrates",7302));

		

		
		ArrayList<Animals> arraylist=new ArrayList<Animals>(treeset1);
		System.out.println(" ");
		
		for(Animals animals:arraylist){
			System.out.println(animals.name+" "+animals.type+" "+animals.numberofspecies);
		}
		
		
		

	}		
		

}
