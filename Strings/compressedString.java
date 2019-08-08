import java.util.*;
import java.lang.*;

class compressedString
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String s1;
		int count=1;
		System.out.println("Enter String : ");
		s1 = sc.next();

		StringBuffer s2 = new StringBuffer(s1);

		for(int i=0;i<s2.length()-1;)
		{
			if(s2.charAt(i) == s2.charAt(i+1))
			{
				count++;
				s2.deleteCharAt(i);
			}
			else
			{
				i++;
				s2.insert(i,count);
				i++;
				System.out.println(s2.toString());
				count=1;
			}
		}
		s2.insert(s2.length(),count);
		System.out.println(s2.toString());
	}
}