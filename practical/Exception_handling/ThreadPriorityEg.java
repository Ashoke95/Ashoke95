package com;

public class ThreadPriorityEg extends Thread{
	
	
	public void run()
	{
		System.out.println("This is my thread .....");
		
	}

	public static void main(String[] args) {

		ThreadPriorityEg t=new ThreadPriorityEg();
		ThreadPriorityEg t1=new ThreadPriorityEg();
		t.start();
		t.setPriority(MAX_PRIORITY);
		System.out.println("priority is :"+t.getPriority());
		System.out.println("name is "+t.getName());
		t1.setPriority(MIN_PRIORITY);
		System.out.println("priority is :"+t1.getPriority());
	}

}
