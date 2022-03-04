package com;

public class ThreadSleep  extends Thread{
	@Override
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			try
			{
				Thread.sleep(5);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
				
			}
			System.out.println(i);
		}
	}
	
public static void main(String a[])
{ThreadSleep t=new ThreadSleep();
ThreadSleep t1=new ThreadSleep();
ThreadSleep t2=new ThreadSleep();
	t.start();
	t1.start();
	t2.start();
}
}
