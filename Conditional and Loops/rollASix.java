public class rollASix {

  public static void main(String[] args) {
    int check = rollSix();
    if(check == 1)
    System.out.println("You won");
    else if(check == 2)
    System.out.println("You Loss");
  }

  public static int rollSix()
  {
    int roll = rollDice();
    while(roll!=6)
    {
      roll = rollDice();
      if(roll == 3)
      break;
    }
    if(roll == 6)
    return 1;
    if(roll == 3)
    return 2;
    else
    return 1;
  }

  public static int rollDice()
  {
    double r = Math.random();
    r = r * 6;
    r += 1;
    int no = (int)r;

    return no;
  }
}
