import java.util.Scanner;

class Game
{
  private String movieName;
  private int lostPoints;
  private String rightLetters;
  private String wrongLetters;
  private boolean gameWon;

  public Game(String path)
  {
    Movies movie = new Movies(path);
    movieName = movie.getRandomMovie().trim();
    lostPoints = 0;
    rightLetters = "";
    wrongLetters = "";
    gameWon = false;
  }

  public boolean gameEnded(){
    if (lostPoints >= 10)
    {
      return true;
    }
    if(!getHiddenTitle().contains("_"))
    {
      gameWon = true;
      return true;
    }
    return false;
}

  public String getMovie()
  {
    return movieName;
  }
  public String getHiddenTitle()
  {
    if (rightLetters.equals(""))
    {
      return movieName.replaceAll("[a-zA-Z]", "_ ");
    }
    else
    {
      return movieName.replaceAll("[a-zA-Z&&[^" + rightLetters + "]]", " _ ");
    }
  }

  public String getWrongLetters()
  {
    return wrongLetters;
  }

  public String inputTheLetter()
  {
    Scanner obj = new Scanner(System.in);
    System.out.println("Guess the Letter: ");
    String letter = obj.nextLine().toLowerCase();

    if(!letter.matches("[a-z]"))
    {
      System.out.println("Please Enter a small Letter");
      return inputTheLetter();
    }
    else if(wrongLetters.contains(letter) || rightLetters.contains(letter))
    {
      System.out.println("You have already guesses the letter");
      return inputTheLetter();
    }
    else
    {
      return letter;
    }
  }

  public void guessTheLetter()
  {
    String guessLetter = inputTheLetter();

    if(movieName.contains(guessLetter))
    {
       rightLetters += guessLetter + guessLetter.toUpperCase();
    }
    else
    {
        lostPoints++;
        wrongLetters += " "+guessLetter;
    }
  }

  public boolean gameWon()
  {
    return gameWon;
  }
}
