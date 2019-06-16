public class arithmetic {

  public static void main(String[] args) {

    int x = 2 + 3;
    int y = 5 - 2;
    int temp = -20;
    int days = 7*4;
    double div = 5/2;
    double accurate = 5/2.0;

    System.out.println(x);
    System.out.println(y);
    System.out.println(temp);
    System.out.println(days);
    System.out.println(div);
    System.out.println(accurate);

    System.out.println(div*accurate);

    // castingS
    int cast = (int)(div*accurate);
    System.out.println(cast);

  }

}
