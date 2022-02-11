package Ashoke;
import java.util.*;
import java.util.Arrays;

 class ReverseArrayAssignment {

public static void main(String[] args) {

		Scanner obj=new Scanner(System.in);
		System.out.println("how namy no you want");
		int n=obj.nextInt();
		int a[]=new int[n];
		System.out.println("Enter number");
		for(int i=0;i<n;i++)
		{
			a[i]=obj.nextInt();
		}
		System.out.println("entered array is ");
		for(int i=0;i<n;i++)
		System.out.print(a[i]+" ");
		System.out.println();
		System.out.println("Reverse element of the array is ");
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]+" ");
		}
			

	}

}
