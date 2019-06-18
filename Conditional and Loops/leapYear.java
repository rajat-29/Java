import java.util.Scanner;

class leapYear
{
  public static void main(String[] args)
  {
    Scanner obj = new Scanner(System.in);
    int n = obj.nextInt();
    if((n%4 ==0 && n%100 != 0) || n%400 == 0)
    {
      System.out.print("Leap Year");
    }
    else
    {
      System.out.print("Not a Leap Year");
    }
  }

}
