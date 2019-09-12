import java.lang.*;

class Buffer
{
	static int no;
	synchronized void display()
	{	
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception e)
		{

		}
		no++;
		System.out.println("Thread = " +no);
   }
}

class Demo extends Thread
{
	Buffer b;
	Demo(Buffer b)
	{
		this.b = b;
		start();
	}
	public void run()
	{
		b.display();
	}
}

class Thread
{
	public static void main(String[] args) 
	{
			Buffer b = new Buffer();
			Demo t1 = new Demo(b);
			Demo t2 = new Demo(b);
	}
}
