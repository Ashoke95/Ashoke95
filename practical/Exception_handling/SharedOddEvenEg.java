package com;

public class SharedOddEvenEg {
	boolean flag=false;
	public synchronized void printOddNumber(int number)throws InterruptedException{
		while(flag)
		{
		wait();	
		}
		flag=true;
		Thread.currentThread().setName("odd Thread :");
		System.out.println(Thread.currentThread().getName()+"  "+number);
		notify();
	}
	public synchronized void printEvenNumber(int number)throws InterruptedException{
		while(!flag)
		{
		wait();	
		}
		flag=false;
		Thread.currentThread().setName("Even Thread :");
		System.out.println(Thread.currentThread().getName()+"  "+number);
		notify();
	}


}
