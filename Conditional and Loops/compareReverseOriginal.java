import java.util.Scanner;

class compareReverseOriginal
{
  public static void main(String[] args)
  {
    Scanner obj = new Scanner(System.in);
    int org = obj.nextInt();
    int org1 = org,rev=0;
    while(org!=0)
    {
      int temp = org%10;
      rev = (rev*10)+temp;
      org /= 10;
    }
    if(org1 == rev)
    System.out.print("Equal");
    else
    System.out.print("Not Equal");
  }
}
