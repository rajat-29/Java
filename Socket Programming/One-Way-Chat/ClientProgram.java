import java.net.*;

class ClientProgram implements Runnable
{
	int clientport=1050,serverport=1051;
	DatagramSocket ds;
	Thread recThread;
	ClientProgram() throws Exception
	{
		ds = new DatagramSocket(clientport);
		recThread = new Thread(this);
		recThread.start();
	}
	public void run()
	{
		byte b[] = new byte[1000];
		while(true)
		{
			try
			{
				DatagramPacket dp = new DatagramPacket(b,b.length);
				
				ds.receive(dp);

				String data = new String(b,0,dp.getLength());
				System.out.println("Serve : "+data);
			}catch(Exception e){}
		}
	}

	public static void main(String[] args) 
	{
		try{
		new ClientProgram();
	}catch(Exception e){}
	}
}