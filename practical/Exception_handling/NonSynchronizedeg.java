package com;


class print//shared resourse
{
	void display(int n)
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(n*i);
			try
			{
				Thread.sleep(500);
			}catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}

class Mythread extends Thread
{
	print p;//create object of print class
	Mythread(print p)
	{
		p.display(5);
		
	}
}
class Mythread1 extends Thread
{
	print p;//create object of print class
	Mythread1(print p)
	{
		p.display(10);
		
	}
}


public class NonSynchronizedeg {

	public static void main(String[] args) {
		print p=new print();//only one object
		 Mythread t1=new  Mythread(p);
		 Mythread1 t2=new Mythread1(p);
		 
		 t1.start();
		 t2.start();
		 

	}

}
