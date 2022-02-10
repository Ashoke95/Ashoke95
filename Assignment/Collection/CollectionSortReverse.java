package Ashoke;

import java.util.*;

public class CollectionSortReverse {
	public static void main(String a[])
	{
		List<String> list=new ArrayList<>();
		list.add("Bina");
		list.add("Mina");
		list.add("Tina");
		list.add("Rama");
		list.add("Sibu");
		list.add("Kartik");
		list.add("Yadav");
		list.add("Gita");
		System.out.println(list+" ");
		Collections.sort(list,Collections.reverseOrder());
	
	System.out.print("element aorting  in descending order\n "+list);

}
}