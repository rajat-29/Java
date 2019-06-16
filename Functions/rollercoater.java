public class rollercoater {

  public static void main(String[] args) {
    int height = 100;
    checkeligibilty(height);
  }

  public static void checkeligibilty(int h)
  {
    if(h > 120)
    {
      System.out.println("You pass the requirement");
    }
    else
    {
      System.out.println("Sorry");
    }
  }

}
