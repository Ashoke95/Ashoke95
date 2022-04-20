package com;

import java.util.Arrays;
import java.util.Scanner;

 class A {
	 int x,y,z,r,x1;
	 int a[]= {3,5,8,1,0,8,4};
	 
	int s=0;
	public void getA()
	{
	Scanner obj=new Scanner(System.in);
	System.out.println("enter 1st no");
	 x=obj.nextInt();
	System.out.println("enter 2nd no");
	y=obj.nextInt();
	System.out.println("enter no to check armstrong");
	x1=obj.nextInt();
	}
 }
 class B extends A{
		void swap()
		{
			z=x;
			x=y;
			y=z;
			
			System.out.println("After swaping numbers  are "+x+" "+y);
		}
	}

 class C extends B
 {
	 void Armstrong()
	 {   
		 int m=x1;
		while(x1>0)
		{
			r=x1%10;
			s=(int) (s+Math.pow(r, 3));
			x1=x1/10;	
		}
		if(s==m)
			System.out.println("no is armstrong");
		else
			System.out.println("no is not amrstrong");
	 }
 }
 class D extends A
 {
	 void sortAscen()
	 {
	 Arrays.sort(a);
	 System.out.println("Array after sorting :");
	 for(int i=0;i<a.length;i++)
	 {
		 System.out.print(a[i]+" ");
    }
 }

	public void Armstrong() {
	
	
	}
 }