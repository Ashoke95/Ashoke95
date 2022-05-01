package com;
import java.util.Scanner;

public class TestASsignment {
	
public static void main(String[] args) {
		

		 Scanner s=new Scanner(System.in);
			
			System.out.println("enter how many element");
			int n=s.nextInt();
			System.out.println("Enter Array ");
			int a[]=new int[n];
			for(int i=0;i<n;i++)
			{
				a[i]=s.nextInt();
			}
			
			int t;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-1-i;j++)
			{
				
				if(a[j]>a[j+1])
				{
					t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
		}
		

			System.out.println("after sort using Bubble sort, array is");
			for(int i=0;i<n;i++)
			{
				System.out.print(a[i]+" ");
			}
			
		
			System.out.println();
			System.out.println("..................................................................................");
			int  first=1,last=n,mid=(first+last)/2;
			
			
			System.out.println("Enter item to find ");
			int item=s.nextInt();
			;int loc = -9999;
			while(first<=last&&a[mid]!=item)
			{
				if(item<a[mid])
				{
					last=mid-1;
				}
				
				else
					first=mid+1;
				mid=(first+last)/2;
			
			}	

	    if(a[mid]==item)
		loc=mid;
		
	   
		

	     if(loc==-9999)
	    	 System.out.println("item not found");
	     
	     else
	    	 System.out.println("item is found  and location is:  "+(loc+1)); 
			}  	 
	
		
	}

	
