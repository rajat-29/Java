import java.util.Scanner;

class swapFirstLastChar
{
  static String swap(String str)
  {
    int l = str.length();
    return str.charAt(l-1) + str.substring(1,l-1) + str.charAt(0);
  }

  static void swapLetters(String str)
  {
    str = str + " ";
    StringBuilder s1 = new StringBuilder();
    StringBuilder s2 = new StringBuilder();

   for(int i=0;i<str.length();i++)
   {
     if(str.charAt(i) == ' ')
     {
       s2.append(swap(s1.toString()));
       s2.append(" ");
       s1 = new StringBuilder();
     }
     else
     {
       s1.append(str.charAt(i));
     }
   }
   System.out.print(s2.toString());
  }

  public static void main(String[] args)
  {
    Scanner obj = new Scanner(System.in);
    String input = obj.nextLine();
    swapLetters(input);
  }
}
