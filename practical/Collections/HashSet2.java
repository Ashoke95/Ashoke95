package Ashoke;
import java.util.*;
import java.util.HashSet;

public class HashSet2 {

	public static void main(String[] args) {

		HashSet<String> set=new HashSet<String>();  
        set.add("O");    
        set.add("B");
        set.add("T");    
        set.add("G");   
        set.add("B");  //java Hashset class is used to create a collection that uses a Hash table for storage
        set.add("A"); //Hashset stores elements by using hashing mechanism
        set.add("M");
        System.out.println(set);//remove duplicate element
      /*  Iterator<String> i=set.iterator();  
        while(i.hasNext())  
        {  
        System.out.println(i.next());  */
      
        List<String> list=new ArrayList<String>(set);
        Collections.sort(list);
        System.out.print(list+" ");
        
        
        
        }
	}
	
	


