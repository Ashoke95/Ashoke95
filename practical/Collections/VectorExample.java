package Ashoke;
import java.util.*;
public class VectorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> v=new Vector<String>();  
		v.add("Ayush");  
		v.add("Amit");  //used to store dynamic array  element
		v.add("Ashish");  
		v.add("Garima");//can store duplicate element
		v.add("Ayush");
		Iterator<String> itr=v.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}
	}

}
