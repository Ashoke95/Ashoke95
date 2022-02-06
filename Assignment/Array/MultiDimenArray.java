package Ashoke;

import java.util.Scanner;

public class MultiDimenArray {

	public static void main(String[] args) {

Scanner sc=new Scanner(System.in);
System.out.println("enter value of row");
int m=sc.nextInt();
System.out.println("enter value of column");
int n=sc.nextInt();
int a[][]=new int[m][n];
System.out.println("enter element");
for(int i=0;i<m;i++)
  {
	for(int j=0;j<n;j++)
	{
		a[i][j]=sc.nextInt();
	}
  }
	
System.out.println("Multidimentional Array is ");

for(int i=0;i<m;i++)
  {
	for(int j=0;j<n;j++)
	{
		System.out.print(a[i][j]+" ");
	}
	System.out.println();
  }
	
	}

}
