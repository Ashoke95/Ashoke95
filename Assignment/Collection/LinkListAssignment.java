package Ashoke;

import java.util.*;

public class LinkListAssignment {

	public static void main(String[] args) {
	
		LinkedList<String> al=new LinkedList<String>();  
		al.add("Ram");  
		al.add("Shyam"); //al is a object by which we call add method  
		al.add("jadu");  
		al.add("Madhu");
		al.add("Ashoke");
		
		System.out.println("Element in the list is: "+al);
		Iterator obj = al.descendingIterator();
		 System.out.println("Elements in Reverse Order:");
	     while (obj.hasNext()) 
		 
		 {
	        System.out.println(obj.next());
	     }
		
	}

}
