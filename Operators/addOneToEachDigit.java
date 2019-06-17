import java.util.Scanner;

class addOneToEachDigit
{
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    int sum=0,i=0,temp;
    int n = obj.nextInt();
    while(n!=0)
    {
      temp = n%10 + 1;
      if(temp == 10)
      {
        temp=0;
      }
      sum += temp*Math.pow(10,i);
      n/=10;
      i++;
    }
    System.out.print(sum);
  }
}
