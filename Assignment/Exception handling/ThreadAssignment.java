package com;

import java.util.Scanner;
class A extends Thread {
	
	public void run()
	{
		try {
			
		
		int a=0,b=1,c,i,count=10;
		System.out.println("fibonacci series is :");
		System.out.print(a+" "+b+" ");
		for(i=2;i<count;i++)
		{
		c=a+b;
		System.out.print(c+" ");
		a=b;
		b=c;
		//Thread.sleep(500);
		}
		System.out.println();
		}catch(Exception e)
				{
			System.out.println(e);
				}
				
	}

 }
public class ThreadAssignment extends Thread {
	
	
	public void run() {
		try {
			
		int f=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value of n");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			f=f*i;
			
		
		}
		System.out.println("factorial is :"+f);
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

 
public static void main(String a[])
{
	ThreadAssignment t=new ThreadAssignment();
	A t1=new A();
	t.start();
	
	t1.run();
}
	
 }
