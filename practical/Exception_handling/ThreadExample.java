
public class ThreadExample extends Thread {
	@Override
	public void run()
	{
		System.out.println("Thread--its my thread ");
	}
	
	public static void main(String args[])

	{
		ThreadExample t=new ThreadExample();
	   t.start();
	}
}
