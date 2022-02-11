package Ashoke;

import java.util.*;
import java.util.Arrays;

 class ArraySortingAssignment {

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

for(int i=0;i<n;i++)
System.out.println("entered array is "+a[i]);

Arrays.sort(a);
System.out.println("After sorting Array is in Ascending order :");
for(int i=0;i<n;i++)
System.out.print(a[i]+" ");
	}

}
