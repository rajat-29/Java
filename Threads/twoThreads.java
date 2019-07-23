import java.lang.*;

class ThreadDemo extends Thread implements Runnable
{
	ThreadDemo()
	{
		start();
	}
	public void run()
	{
		for(int i=0;i<3;i++)
		{
			System.out.println("Child is = "+ i);
		}
		try
		{
			Thread.sleep(500);
		}
		catch(Exception e)
		{}
	}
}

class twoThreads
{
	public static void main(String[] args) 
	{
		ThreadDemo d1 = new ThreadDemo();	

		for(int i=0;i<3;i++)
		{
			System.out.println("Parent is = "+ i);
		}
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception e)
		{}
	}
}