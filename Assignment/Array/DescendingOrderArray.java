package Ashoke;
import java.util.Arrays;
import java.util.Collections;
import java.util.*;
public class DescendingOrderArray {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("How many number");
	int n=sc.nextInt();
	Integer a[]=new Integer[n];
	System.out.println("Enter "+n+" number");
	for(int i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
	}
	
	Arrays.sort(a,Collections.reverseOrder());
	System.out.print("Array in Descending order  "+Arrays.toString(a));
	
	}

}