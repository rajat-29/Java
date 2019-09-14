class Main
{
  public static void main(String[] args)
  {
    Game game = new Game("movies.txt");

    System.out.println("Welcome to the Guess the Movie Game!");
    System.out.println("The rules are simple, Computer will randomly picks a movie title, and shows you how many letters its made up of");
    System.out.println("Your goal is to try to figure out the movie by guessing one letter at a time.");
    System.out.println("If a letter is indeed in the title the computer will reveal its correct position in the word, if not, you will lose a point.");
    System.out.println("If you lose 10 points, then game over!");
    System.out.println("Let's start!");
    System.out.println("The Movie Title has "+game.getMovie().length());

    while(!game.gameEnded())
    {
      System.out.println("You are guessing: " + game.getHiddenTitle());
      System.out.println("You have guessed (" + game.getWrongLetters().length()/2+ ") wrong letters" + game.getWrongLetters());
      game.guessTheLetter();
    }

    if (game.gameWon())
    {
      System.out.println("You win!");
      System.out.println("You have guessed '"+ game.getMovie()+"' correctly");
    }
    else
    {
      System.out.println("You have guessed ("+ game.getWrongLetters().length()/2 +") wrong letters:" + game.getWrongLetters());
      System.out.println("You lost!");
      System.out.println("The movie title was "+ game.getMovie());
      System.out.println("Better luck next time.");
     }
  }
}
