package Ashoke;

import java.util.Scanner;

public class ArraySumAsignment {
   
	public static void main(String[] args) {
		  int s=0;
		Scanner obj=new Scanner(System.in);
		System.out.println("how namy no you want");
		int n=obj.nextInt();
		int a[]=new int[n];
		System.out.println("Enter number");
		for(int i=0;i<n;i++)
		{
			a[i]=obj.nextInt();
		}
       System.out.println("Entered array is: ");
		for(int i=0;i<n;i++)
		{
		System.out.println(a[i]+" ");
		
		 s+=a[i];
		
		}
		
		System.out.println("some of array is "+s);
	}

}
