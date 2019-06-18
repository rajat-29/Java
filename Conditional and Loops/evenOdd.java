import java.util.Scanner;

class evenOdd
{
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    int n = obj.nextInt();
    if(n%2==0)
    System.out.print("EVEN");
    else
    System.out.print("ODD");
  }
}
