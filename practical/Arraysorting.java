package Ashoke;
import java.util.Arrays;
public class Arraysorting {

	public static void main(String[] args) {
		//defining an array of integer type   
		int [] a= new int [] {90, 23, 5, 109, 12, 22, 67, 34};  
		//invoking sort() method of the Arrays class  
		Arrays.sort(a);   
		System.out.println("Elements of array sorted in ascending order: ");  
		//prints array using the for loop  
		for (int i = 0; i < a.length; i++)   
		{       
		System.out.print(a[i]+ " ");   
		}

	}

}
