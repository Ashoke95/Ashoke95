package Ashoke;
import java.util.Arrays;   
import java.util.Collections;   
public class Arraysort {

	public static void main(String[] args) {
		
		 String str[] = { "Mango","apple","grapes","papaya"," pineapple","banana","orange"};
		 Arrays.sort(str, Collections.reverseOrder());   
		 System.out.println("Array  in descending order: " +Arrays.toString(str));   
	}

}
