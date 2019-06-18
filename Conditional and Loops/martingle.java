public class martingle {

  public static void main(String[] args) {
    int money = bet();
    System.out.println(money);
  }

  public static int bet()
  {
    int money = 1000;
    int bet = 10;
    while(money > bet)
    {
      boolean win = play();
      if(win)
      {
        money += bet;
        bet = 10;
      }
      else
      {
        money -= bet;
        bet *= 2;
      }
    }
    return money;
  }

  public static boolean play()
  {
    double r = Math.random();
    r = r*100;
    r += 1;
    int no = (int)r;

    if(no<=70)
    return false;
    else
    return true;
  }
}
