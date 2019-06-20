import java.util.Scanner;

class guessTheNumberGame
{
  public static void main(String[] args)
  {
    int randomNo = (int)(Math.random()*100) + 1;
    boolean hasWon = true;

    System.out.println("Hi There, I have selected a random no between 1 to 100");
    System.out.println("You have total 10 guesses to find out the no");

    Scanner obj = new Scanner(System.in);

    for(int i=10;i>0;i--)
    {
      System.out.println("You have " + i + " guess(es) left , Please choose your answer");
      int n = obj.nextInt();

      if(randomNo < n)
      {
          System.out.println("Randon no is less than your guess no " + n);
      }

      else if(randomNo > n)
      {
          System.out.println("Randon no is greater than your guess no " + n);
      }
      else if(randomNo == n)
      {
        hasWon = true;
        break;
      }
    }
    if(hasWon)
    {
      System.out.println("Congo you win");
    }
    else
    {
      System.out.println("Game over , You Loose");
      System.out.print("The random No was " + randomNo);
    }

  }
}
