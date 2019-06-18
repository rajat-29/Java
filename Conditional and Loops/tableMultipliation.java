import java.util.Scanner;

class tableMultipliation
{
  public static void main(String[] args)
  {
    Scanner obj = new Scanner(System.in);
    int n = obj.nextInt();
    int m = obj.nextInt();
    for(int i=1;i<=m;i++)
    {
      System.out.println(n*i);
    }
  }
}
