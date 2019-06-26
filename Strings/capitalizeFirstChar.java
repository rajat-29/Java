import java.util.Scanner;

class capitalizeFirstChar
{
  static String capital(String str)
  {
    int l = str.length();
    char ch = str.charAt(0);
    ch-=32;
    StringBuilder s3 = new StringBuilder();
    s3.append(ch);
    s3.append(str.substring(1,l));
    return s3.toString();
  }

  static void capitilizeLetter(String str)
  {
    str = str + " ";
    StringBuilder s1 = new StringBuilder();
    StringBuilder s2 = new StringBuilder();

   for(int i=0;i<str.length();i++)
   {
     if(str.charAt(i) == ' ')
     {
       s2.append(capital(s1.toString()));
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
    capitilizeLetter(input);
  }
}
