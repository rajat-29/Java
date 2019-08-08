import java.util.*;

class removeVowel
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String s1;
		System.out.println("Enter Word to remove vowel : ");
		s1 = sc.next();

		StringBuffer s2 = new StringBuffer(s1);

		for(int i=0;i<s2.length();)
		{
			if(s2.charAt(i) == 'A' || s2.charAt(i) == 'a' || s2.charAt(i) == 'I' || s2.charAt(i) == 'i' 
				|| s2.charAt(i) == 'E' || s2.charAt(i) == 'e' || s2.charAt(i) == 'O' || s2.charAt(i) == 'o' ||
				 s2.charAt(i) == 'U' || s2.charAt(i) == 'u')
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