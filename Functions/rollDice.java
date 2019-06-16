public class rollDice {

  public static void main(String[] args) {
    int no = roll();
    System.out.println(no);
  }

  public static int roll()
  {
    double randomNo = Math.random();

    randomNo = randomNo * 6;

    randomNo += 1;

    int randomInt = (int)randomNo;

    return randomInt;
  }

}
