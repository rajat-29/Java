class Producer extends Thread
{
	Buffer b;
	Producer(Buffer b)
	{
		this.b = b;
		start();
	}
	public void run()
	{
		int i=1;
		while(true)
		{
			b.setData(i++);
		}
	}
}

class Consumer extends Thread
{
	Buffer b;
	Consumer(Buffer b)
	{
		this.b = b;
		start();
	}
	public void run()
	{
		while(true)
		{
			b.getData();
		}
	}
}

class Buffer
{
	public int data;
	boolean isEmpty = true;

	synchronized void setData(int data)
	{
		if(isEmpty)
		{
			this.data = data;
			System.out.println("Put Data" + data);
			isEmpty = false;
			notify();
			try
			{
				wait();
			}catch(Exception e)
			{}
		}
	}
	synchronized void getData()
	{
		if(isEmpty == false)
		{
			this.data = data;
			System.out.println("Get Data" + data);
			isEmpty = true;
			notify();
			try
			{
				wait();
			}catch(Exception e)
			{}
		}
	}
}

class InterCommunication
{
	public static void main(String[] args) 
	{
		Buffer b = new Buffer();
		Producer p = new Producer(b);	
		Consumer c = new Consumer(b);
	}
}

