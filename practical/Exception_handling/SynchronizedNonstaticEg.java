package com;


class print2
{
synchronized  void display(int n)
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




public class SynchronizedNonstaticEg {
	public static void main(String[] args) {
	
	final print2 p=new print2();
			Thread t1=new Thread()
			{
				public void run()
				{
				print1.display(5);
				}
				};
			
				Thread t2=new Thread()
				{
					public void run()
					{
					print1.display(10);
					}
					};
				
				 
				 t1.start();
				 t2.start();
				 
		
		
		
		


}

}
