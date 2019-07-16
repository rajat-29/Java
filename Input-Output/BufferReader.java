import java.io.*;
import java.lang.*;
import java.util.*;
public class BufferReader
{
	public static void main(String args[]) throws IOException
	{
	int a,b,c;
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String x = br.readLine();
		a = Integer.parseInt(x);
		b = Integer.parseInt(br.readLine());
		System.out.println(a);
	}
}
