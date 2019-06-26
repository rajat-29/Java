import java.util.Scanner;

class countPalindrome {

  static int countPalin(String str)
  {
    str = str + " ";
    String word = "";
    String reverse = "";
    int count = 0;
    for(int i=0;i<str.length();i++)
    {
      char ch = str.charAt(i);
      if(ch != ' ')
      {
        word = word + ch;
      }
      else
      {
        for(int j=word.length()-1;j>=0;j--)
          reverse = reverse + word.charAt(j);

          System.out.println(reverse);

        if(word.equals(reverse))
        count++;

        word = "";
        reverse = "";
      }
    }
    return count;
  }

  public static void main(String[] args)
  {
    Scanner obj = new Scanner(System.in);
    String input = obj.nextLine();
    int count = countPalin(input);
    System.out.print(count);
  }

}
