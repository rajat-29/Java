import java.util.Scanner;

class matrixMultiplication
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

    System.out.println("Enter r2");
    int r2 = obj.nextInt();
    System.out.println("Enter c2");
    int c2 = obj.nextInt();

    int b[][] = new int[r2][c2];

    for(int i=0;i<r2;i++)
    for(int j=0;j<c2;j++)
    b[i][j] = obj.nextInt();

    int mul[][] = new int[r1][c2];

    for(int i=0;i<r1;i++)
    for(int j=0;j<c2;j++)
    mul[i][j]=0;

    for(int i=0;i<r1;i++)
    for(int j=0;j<c2;j++)
    for(int k=0;k<c1;k++)
    mul[i][j] += a[i][k]*b[k][j];

    for(int j=0;j<r1;j++)
        for(int k=0;k<c2;k++) {
          System.out.print(mul[j][k] +" ");
          if(k==c2-1)
            System.out.println();
    }




  }
}
