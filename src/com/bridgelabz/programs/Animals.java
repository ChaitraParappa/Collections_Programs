package com.bridgelabz.programs;

import java.util.Comparator;

public class Animals implements Comparable<Animals>{
	
	

	String name;
	String type;
	int numberofspecies;

	public Animals(String name, String type, int numberofspecies) {
		this.name = name;
		this.type = type;
		this.numberofspecies = numberofspecies;
	}

	public int compareTo(Animals o) {
		 if(numberofspecies>o.numberofspecies){  
		        return 1;  
		    }else if(numberofspecies<o.numberofspecies){  
		        return -1;  
		    }else{  
		    return 0;  
		    }  
	}
	public boolean equals(Object obj){
		if(obj==null)
			return false;
		if(obj==this)
			return true;
		
		if(this.numberofspecies==((Animals)obj).numberofspecies && this.name==((Animals)obj).name)
			return false;
		 return false;
	}
	
	
	public int hashCode(){
		return this.numberofspecies+25;
	}
	
	

}
