import java.util.Scanner;

class largestOfThreeNumbers
{
  public static void main(String[] args)
  {
    Scanner obj = new Scanner(System.in);
    int a = obj.nextInt();
    int b = obj.nextInt();
    int c = obj.nextInt();

    if(a>b && a>c)
    {
      System.out.print(a);
    }
    else if(b>a && b>c)
    {
      System.out.print(b);
    }
    else
    System.out.print(c);
  }
}
