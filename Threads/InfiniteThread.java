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
	void setData(int data)
	{
		this.data = data;
		System.out.println("Put Data" + data);
	}
	void getData()
	{
		System.out.println("Get Data" + data);
	}
}

class InfiniteThread
{
	public static void main(String[] args) 
	{
		Buffer b = new Buffer();
		Producer p = new Producer(b);	
		Consumer c = new Consumer(b);
	}
}

