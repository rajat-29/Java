public class googol {

  public static void main(String[] args) {
    String goo = "1";
    int len = goo.length();

    while(len<101)
    {
      goo = goo + '0';
      len = goo.length();
    }

    System.out.println(goo);
  }

}
