package Ashoke;
import java.util.*;
public class EnumerationCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Enumeration days;
	      Vector dayNames = new Vector();

	      dayNames.add("Sunday");
	      dayNames.add("Monday");
	      dayNames.add("Tuesday");
	      dayNames.add("Wednesday");
	      dayNames.add("Thursday");
	      dayNames.add("Friday");
	      dayNames.add("Saturday");
	      days = dayNames.elements();//copying the element to Enumeration,'days' is a enumeration

	      while (days.hasMoreElements()) {
	         System.out.println(days.nextElement());
	      }
	}

}
