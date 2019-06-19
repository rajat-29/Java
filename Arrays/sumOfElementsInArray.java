import java.util.Scanner;

class sumOfElementsInArray
{
  public static void main(String[] args)
  {
    Scanner obj = new Scanner(System.in);
    int a[] = new int[10];
    int sum=0;
    for(int i=0;i<10;i++)
    {
      a[i] = obj.nextInt();
      sum += a[i];
    }
    System.out.print(sum);
  }
}
