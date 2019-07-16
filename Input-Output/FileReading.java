import java.io.*;
import java.util.*;
import java.lang.*;                 

public class FileReading
{
	public static void main(String[] args) 
	{	
		try
		{
			FileReader fr = new FileReader("BufferReader.java");
			BufferedReader br = new BufferedReader(fr);

			String a = br.readLine();
			while(a!=null)
			{
				System.out.println(a);
				a = br.readLine();
			}
		}
		catch(Exception e)
		{

		}
	}
}