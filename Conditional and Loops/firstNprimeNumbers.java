import java.util.Scanner;

class firstNprimeNumbers
{
    public static void main(String[] args)
    {
        int fact=0,count;
      Scanner obj = new Scanner(System.in);
      int n = obj.nextInt();
      int n1 = obj.nextInt();
      for(int i=2;i<=n;i++)
      {
        count=0;
        for(int j=1;j<=i;j++)
        {
          if(i%j==0)
            count++;
        }
        if(count==2 && i<=n)
        {
          fact++;
          if(fact<=n1)
            System.out.println(i);
          if(fact==n1)
            break;
        }
      }
    }
}
