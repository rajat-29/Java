import java.util.Scanner;

class grossSalary {

  public static void main(String[] args)
  {
    int hra,da;
    Scanner obj = new Scanner(System.in);
    int n = obj.nextInt();
    hra=(10*n)/100;
    da=(20*n)/100;
    n = n+hra+da;
    System.out.print(n);
  }

}
