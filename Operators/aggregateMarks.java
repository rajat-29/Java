import java.util.Scanner;

class aggregateMarks {

  public static void main(String[] args) {
    int sum=0,avg=0;
    Scanner obj = new Scanner(System.in);
    int a[] = new int[5];
    for(int i=0;i<5;i++)
    {
      a[i] = obj.nextInt();
      sum += a[i];
    }
    avg = (sum/5);
    System.out.print(sum + " " + avg);
  }

}
