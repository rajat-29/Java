import java.net.*;
import java.io.*;

public class ServerProgram
{
	int clientport=1050,serverport=1051;
	DatagramSocket ds;
	ServerProgram() throws Exception
	{
		ds = new DatagramSocket(serverport);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true)
		{
			System.out.println("Enter Message : ");
			String data = br.readLine();
			if(data.equals("EXIT"))
				break;

			DatagramPacket dp = new DatagramPacket(data.getBytes(),data.length(),InetAddress.getLocalHost(),clientport);

			ds.send(dp);
		}
	
	}

	public static void main(String[] args)
	{
		try
		{
			new ServerProgram();	
		}catch(Exception e){System.out.print(e);}
	}
}