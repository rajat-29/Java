import java.util.Scanner;

class largestNoinArray
{
  public static void main(String[] args)
  {
    Scanner obj = new Scanner(System.in);
    int a[] = new int[5];

    for(int i=0;i<5;i++)
    a[i] = obj.nextInt();

    int large = a[0];

    for(int i=1;i<5;i++)
    {
      if(large<a[i])
      {
        large = a[i];
      }
    }
    System.out.print(large);
  }
}
