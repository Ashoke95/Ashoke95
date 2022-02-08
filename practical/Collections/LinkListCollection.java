package Ashoke;
import java.util.*;
public class LinkListCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> al=new LinkedList<String>();  
		al.add("Ravi");  
		al.add("Vijay"); //al is a object by which we call add method  
		al.add("Ravi");  
		al.add("Ajay");
		al.add("Ashoke");
		Iterator<String> itr=al.iterator();  
		while(itr.hasNext())//hashset is a method which iterate with collection
		{  
		System.out.println(itr.next());  

	}

}
}

