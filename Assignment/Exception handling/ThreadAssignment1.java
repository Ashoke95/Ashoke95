package com;

import java.util.Scanner;

public class ThreadAssignment1 implements Runnable{
	
	public void run()
	{
		int i,count;
		try {
        System.out.print("Enter value of n : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Prime numbers between 1 to "+n+" are: ");
        for(int j=2;j<=n;j++)
        {
        	count=0;
        	for(i=1;i<=j;i++)
        	{
        		if(j%i==0)
        		{
        			count++;        
        		}
        	}
        	if(count==2)
        		System.out.print(j+"  "); 
        	
        }
        System.out.println();
        System.out.println("Thank You!");
	}catch(Exception e)
	   {
		System.out.println(e);
	   }
	}
	public static void main(String[] args) {
		ThreadAssignment1 t=new ThreadAssignment1();
		Thread t1=new Thread(t);
		t1.start();
	
		
		
	}

}
