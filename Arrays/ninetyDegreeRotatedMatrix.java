import java.util.Scanner;

class ninetyDegreeRotatedMatrix
{
  public static void main(String[] args)
  {
    Scanner obj = new Scanner(System.in);
    int n = obj.nextInt();
    int k;

    for(int m=0;m<n;m++)
    {
      int row = obj.nextInt();
      int a[][] = new int[row][row];
      int b[][] = new int[row][row];

      for(int i=0;i<row;i++)
        for(int j=0;j<row;j++)
          a[i][j] = obj.nextInt();

      for(int i=0;i<row;i++)
      {
        k=row-1;
        for(int j=0;j<row;j++)
        {
          b[i][j]=a[k][i];
          k--;
        }
      }

      for(int i=0;i<row;i++)
        for(int j=0;j<row;j++)
        {
          System.out.print(b[i][j]);
          if(j<row-1)
            System.out.print(" ");
          if(j==row-1)
            System.out.println();
        }

      System.out.println();
    }

  }
}
