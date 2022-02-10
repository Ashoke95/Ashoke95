package Ashoke;
import java.util.*;
public class TreesetExample {

	public static void main(String[] args) {

		TreeSet<String> set=new TreeSet<String>();  
		set.add("Ravi");  
		set.add("Vijay");
		set.add("Ashoke");
		set.add("Ravi");  //TreeSet takes non repeated values  and produce ascending order element
		set.add("XYZ");
		set.add("XYZ");
		set.add("Ajay");  
		//traversing elements  
		Iterator<String> itr=set.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  

	}

}
