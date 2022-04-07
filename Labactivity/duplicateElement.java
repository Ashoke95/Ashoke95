package com;

import java.util.Arrays;
import java.util.Collections;

public class duplicateElement {

	public static void main(String[] args) {
		int a[]= {3,5,7,3,9,7,5};
		Arrays.sort(a);
		System.out.println("element in descending order: ");
		for(int i=a.length-1;i>=0;i--)
		System.out.print(a[i]+" ");
		System.out.println();
	    System.out.println("duplicate element in the array is: ");
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
		
			if(a[i]==a[j])
			{
				System.out.println(a[i]);
			}
		  }
	
		}	
		
		
	}

	}
