import java.lang.*;

class ThreadDemo extends Thread implements Runnable
{
	Buffer b;

	ThreadDemo(Buffer b)
	{
		this.b = b;
		start();
	}
	public void run()
	{
		for(int i=0;i<1;i++)
		b.display();
	}
}

class Buffer
{
	void display()
	{
		System.out.println("Hello");
		try
		{
			Thread.sleep(500);
		}
		catch(Exception e)
		{}
		System.out.println("World");
	}
}

class SynchronizeExample1
{
	public static void main(String[] args) 
	{
		Buffer b = new Buffer();

		ThreadDemo d1 = new ThreadDemo(b);
		ThreadDemo d2 = new ThreadDemo(b);
	}
}