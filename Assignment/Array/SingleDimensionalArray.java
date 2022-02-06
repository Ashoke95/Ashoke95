package Ashoke;


import java.util.*;
public class SingleDimensionalArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("How many Element");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter "+n+" Element");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Entered Element is ");
		for(int i=0;i<n;i++)
		System.out.println("a["+i+"]= "+a[i]);
	}

}
