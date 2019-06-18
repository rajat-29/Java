import java.util.Scanner;

class sumofFirstNnumbers
{
  public static void main(String[] args)
  {
    Scanner obj = new Scanner(System.in);
    int n = obj.nextInt();
    int sum=0;
    for(int i=1;i<=n;i++)
    {
      sum += i;
    }
    System.out.print(sum);
  }

}
