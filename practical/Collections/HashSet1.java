package Ashoke;
import java.util.*;
public class HashSet1 {

	public static void main(String[] args) {
		
		HashSet<String> set=new HashSet();  
        set.add("One");    
        set.add("Two");    
        set.add("Three");   
        set.add("Four");  
        set.add("Five"); 
        set.add("one");
        Iterator<String> i=set.iterator();  
        while(i.hasNext())  
        {  
        System.out.println(i.next());  
        }
	}

}
