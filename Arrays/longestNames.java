public class longestNames
{
  public static void main(String[] args)
  {
    String [] arr = {"Anja","Kimberli","Edmond","Shenna","Apolonia","Caroll","Hieke"};
    findLongestName(arr);
  }

  public static void findLongestName(String [] t)
  {
    String longestName = t[0];
    for(int i=1;i<t.length;i++)
    {
      if(t[i].length() > longestName.length())
      {
        longestName = t[i];
      }
    }
System.out.print(longestName);
  }
}
