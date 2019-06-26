import java.util.Scanner;


class reverseString
{

  static void reverseStr(String str)
  {
    StringBuilder s1 = new StringBuilder();
    for(int i=str.length()-1;i>=0;i--)
    {
      s1.append(str.charAt(i));
    }
    System.out.print(s1.toString());
  }

  public static void main(String[] args)
  {
    Scanner obj = new Scanner(System.in);
    String input = obj.nextLine();
    reverseStr(input);
  }
}
