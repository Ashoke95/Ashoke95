package Ashoke;
import java.util.*;
public class UpdateArrayList {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("Bikash");
		list.add("Bipin");
		list.add("Biltu");
		list.add("Rohit");
		list.add("Rahul");
		System.out.println("Element in the list "+list);

		list.set(1,"Bipin Rao");
		System.out.print("element in the list after update : " +list);
}
}
