package com;

public class SortArray {

	public static void main(String[] args) {
		int t;
		int a[]= {5,7,9,0,2,6,10};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					t=a[i];
					a[i]=a[j];
					a[j]=t;	
				}
			}
		}
		System.out.println("Array after sorting : ");
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+"  ");
		System.out.println();
		System.out.println("Array in descending order: ");
		for(int i=a.length-1;i>=0;i--)
			System.out.print(a[i]+"  ");
		
	}

}
