package com;


class Odd extends Thread{
	int maxnumber;
	SharedOddEvenEg sharedResourse;
	Odd(int number,SharedOddEvenEg sharedResourse)
	{
		this.maxnumber=number;
		this.sharedResourse=sharedResourse;
	}
	public void run()
	{
		int minnumber=1;
		try {
			while(minnumber<=maxnumber)
			{
				sharedResourse.printOddNumber(minnumber);	
				minnumber=minnumber+2;
				
			}
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
class Even extends Thread
{
	int maxevenno;
	SharedOddEvenEg sharedResourse;

Even(int number,SharedOddEvenEg sharedResourse)
{
	this.maxevenno=number;
	this.sharedResourse=sharedResourse;
	
}
	public void run()
	{
	int mineven=2;
	try {
		while(mineven<=maxevenno)
		{
			sharedResourse.printEvenNumber(mineven);
			mineven=mineven+2;
			
		}
	}catch(Exception e)
	{
		System.out.println(e);
	}
	}
}

public class EvenOddThreadSynchronized {

	
	public static void main(String a[])
	{
		SharedOddEvenEg sharedResourse=new SharedOddEvenEg();
		
		Odd oddnum=new Odd(100,sharedResourse);
		Even evenno=new Even(100,sharedResourse);
		oddnum.start();
		evenno.start();
	}
}
