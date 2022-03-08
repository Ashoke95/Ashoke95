package com;

public class ThreadJoineg  extends Thread {
	public void run()
	{
	
	for(int i=1;i<=10;i++)
	{
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
			
		}
		System.out.println(i);
	}
	}
public static void main(String a[])
{
	
	ThreadJoineg t=new ThreadJoineg();
	ThreadJoineg t1=new ThreadJoineg();
	ThreadJoineg t2=new ThreadJoineg();
t.start();
try {
	t.join();
} catch (InterruptedException e) {

	e.printStackTrace();
}
t1.start();
t2.start();

}
}
