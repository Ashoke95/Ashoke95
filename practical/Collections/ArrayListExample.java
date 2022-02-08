package Ashoke;
import java.util.*;
public class ArrayListExample {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
			list.add("Ravi");//Adding object in arraylist  
			list.add("Vijay");  
			list.add("Ravi");  //Arraylist can be used to store duplicate data
			list.add("Ajay");
			list.add("Ashoke");
			//Traversing list through Iterator  
			Iterator itr=list.iterator();  //Iterator is a interface, used to go to the next value
			while(itr.hasNext())
			{  
			System.out.println(itr.next());  
			}
	}


}