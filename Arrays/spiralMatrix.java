import java.util.Scanner;

class spiralMatrix
{
  public static void main(String[] args)
  {
      Scanner obj = new Scanner(System.in);
      System.out.println("Enter r1");
      int r1 = obj.nextInt();
      System.out.println("Enter c1");
      int c1 = obj.nextInt();

      int a[][] = new int[r1][c1];

      for(int i=0;i<r1;i++)
      for(int j=0;j<c1;j++)
      a[i][j] = obj.nextInt();

      printSpiral(a, r1, c1);

  }
  static void printSpiral(int a[][], int m, int n)
  {
    int l=0,k=0;
    while(k<m && l<n)
    {
      for(int i=l;i<n;i++)
      {
        System.out.println(a[k][i]);
      }
      k++;

      for(int i=k;i<m;i++)
      {
        System.out.println(a[i][n-1]);
      }
      n--;

      if(k<m)
      {
        for(int i=n-1;i>=l;i--)
        {
          System.out.println(a[m-1][i]);
        }
        m--;
      }

      if(l<n)
      {
        for(int i=m-1;i>=k;i--)
        {
          System.out.println(a[i][l]);
        }
        l++;
      }
    }

  }
}
