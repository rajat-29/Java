public class minNo
{
  public static void main(String[] args)
  {
      double [] arr = {7.85,7.32,4.9,6.22,5.4,7.3,5.19};
      search(arr);
  }

  public static void search(double [] t)
  {
    double min = t[0];
    for(int i=0;i<t.length;i++)
    {
      if(t[i]<min)
      min = t[i];
    }
    System.out.println(min);
  }
}
