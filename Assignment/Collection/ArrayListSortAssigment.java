package Ashoke;
import java.util.*;
public class ArrayListSortAssigment {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		  list.add("Red");
		  list.add("Yellow");
		  list.add("Green");
		  list.add("Blue");
		  list.add("Orange");
		  list.add("White");
		  list.add("Black");
		  
		  System.out.println("List before sorting : "+list);
		  Collections.sort(list);
		  System.out.println("List after sorting: "+list);  
	}

}
