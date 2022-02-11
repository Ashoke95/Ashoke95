package Ashoke;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayBinarySearch1 {

	public static void main(String[] args) {
		int item,first ,last,mid;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("how many  number");
		int num=sc.nextInt();
		
		int arr[]=new int[num];
		System.out.println("Enter"+num+"numbers");
		for(int i=0;i<num;i++)
		arr[i]=sc.nextInt();
	Arrays.sort(arr);
	
	System.out.println("Array after sorting ");
	for(int i=0;i<num;i++)
		System.out.println(arr[i]);
		 System.out.println("Enter the search value:");
	      item = sc.nextInt();
	      first = 0;
	      last = num - 1;
	      mid = (first + last)/2;

	      while( first <= last )
	      {
	         if ( arr[mid] < item )
	           first = mid + 1;
	         else if ( arr[mid] == item )
	         {
	           System.out.println(item + " found at location " + (mid + 1) + ".");
	           break;
	         }
	         else
	         {
	             last = mid - 1;
	         }
	         mid = (first + last)/2;
	      }
	      if ( first > last )
	          System.out.println(item + " is not found.\n");
	
	
	}

}
