package com;

public class ThreadExample1 implements Runnable {

	@Override
	public void run() {
		System.out.println("thread is running");
		
		
	}
	public static void main(String a[])
	{
		ThreadExample1 a1=new ThreadExample1();
		Thread t=new Thread(a1);
		t.start();
	}

}
