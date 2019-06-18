import java.util.Scanner;

class fatorialofNumber
{
  public static void main(String[] args)
  {

    Scanner obj = new Scanner(System.in);
    int n = obj.nextInt();
    int fact=1;
    for(int i=n;i>0;i--)
    {
        fact = fact*i;
    }
    System.out.print(fact);

  }
}
