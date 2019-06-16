public class addNUmbers {

  public static void main(String[] args) {
    int sum = addNo();
    System.out.println(sum);
  }

  public static int addNo()
  {
    int sum = 0;
    for(int i=1;i<20;i++)
    {
      sum += i;
    }
  return sum;
  }
}
