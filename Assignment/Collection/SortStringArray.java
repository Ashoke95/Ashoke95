package Ashoke;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class SortStringArray {

	public static void main(String[] args) {

List<String> list=new ArrayList<String>();

list.add("Ram");
list.add("Ashoke");
list.add("Tapas");
list.add("Saikat");
list.add("Ayan");
list.add("Srimita");
list.add("Kajal");
System.out.print("string in the list is :"+list+"\n");

Collections.sort(list);
System.out.print("String after sorting is: "+list);
	}

}
