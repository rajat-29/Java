public class temp {

  public static void main(String[] args) {
    int [] arr = {1,2,3,4,5,6,7,8,9,10};
    calAvg(arr);
  }

  public static void calAvg(int [] t)
  {
    int sum = 0;
    for(int i = 0;i<t.length;i++)
    sum += t[i];
    int avg = sum/t.length;
    System.out.println(sum);
    System.out.print(avg);
  }
}
