import java.util.*;

class removeSpace
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String s1;
		System.out.println("Enter String : ");
		s1 = sc.nextLine();
		StringBuffer s2 = new StringBuffer(s1);

		for(int i=0;i<s2.length();)
		{
			if(s2.charAt(i) == ' ' && s2.charAt(i+1) == ' ')
			{
				s2.deleteCharAt(i);
			}
			else
			{
				i++;
			}
		}	
		System.out.println(s2.toString());
	}
}