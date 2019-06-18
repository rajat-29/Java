public class threeDice {

  public static void main(String[] args) {

    int count = keepRolling();
    System.out.println(count);
  }

  public static int keepRolling()
  {
    int dice1 = rollDice();
    int dice2 = rollDice();
    int dice3 = rollDice();
    int count = 1;

    while(!(dice1 == dice2 && dice2 == dice3))
    {
      dice1 = rollDice();
      dice2 = rollDice();
      dice3 = rollDice();
      count++;
    }
    return count;
  }

  public static int rollDice()
  {
    double r = Math.random();
    r = r*6;
    r += 1;
    int no = (int)r;

    return no;
  }
}
