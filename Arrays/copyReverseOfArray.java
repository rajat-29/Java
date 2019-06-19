import java.util.Scanner;

class copyReverseOfArray
{
  public static void main(String[] args)
  {
    Scanner obj = new Scanner(System.in);
    int a[] = new int[10];
    int b[] = new int[10];
    int j=0;

    for(int i=0;i<10;i++)
     a[i] = obj.nextInt();

    for(int i=9;i>=0;i--)
      b[j++] = a[i];

    for(int i=0;i<10;i++)
    System.out.println(b[i]);


  }
}
