package com;

public class DaemonThread extends Thread{
	public void run()
	{
		System.out.println("user or Deamon Thread");
	}

	public static void main(String[] args) {
		DaemonThread t=new DaemonThread();
		t.setDaemon(true);
		t.start();
		System.out.println("Main Thread");
		
		System.out.println(t.getName()+"  "+t.isDaemon());
		

	}

}
