import java.util.Scanner;

class kaprekarNumber
{
    public static void main(String[] args)
    {
      int n1,square,digit,no,a,b,sq1,sum,check;
        Scanner obj = new Scanner(System.in);

        check=0;
        n1 = obj.nextInt();
        square = (int)Math.pow(n1,2);
        digit = (int)Math.log10(square);
        digit++;
        if(n1==1)
        {
          System.out.println("1");
          check=1;
        }
        for(int j=1;j<digit;j++)
        {
          no = (int)Math.pow(10,j);
          sq1 = square;
          a = (sq1%no);
          b = (sq1/no);
          sum = (a+b);
          if(sum==n1){
            System.out.println("1");
            check=1;
          }
        }
          if(check!=1)
            System.out.println("0");


    }
}
