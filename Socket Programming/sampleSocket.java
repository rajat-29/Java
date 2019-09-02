import java.net.*;
import java.util.*;
import java.lang.*;
import java.io.*;

class sampleSocket
{
	public static void main(String[] args) 
	{
		try
		{
			Socket s = new Socket("whois.internic.net",43);
			//s.accept();

			InputStream is = s.getInputStream();
			OutputStream os = s.getOutputStream();

			  BufferedReader reader = new BufferedReader(new InputStreamReader(is));

			String name;

			PrintWriter writer = new PrintWriter(os, true);
            writer.println("rediff.com");

			//os.write(name.getBytes());

			while(true)
			{
				name = reader.readLine();

				if(name == null)
					break;

				System.out.println(name);

			}

			//s.close();
		}catch (UnknownHostException ex) {
 
            System.out.println("Server not found: " + ex.getMessage());
 
        } catch (IOException ex) {
 
            System.out.println("I/O error: " + ex.getMessage());
        }
	}
}