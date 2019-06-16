public class musicPlaying {

  public static void main(String[] args) {
    boolean isPlaying = true;
     Playing(isPlaying);
  }

  public static void Playing(boolean isPlaying) {
    if(isPlaying) {
      System.out.println("Music is Playing");
    }
    else
    {
       System.out.println("Music is not Playing");
    }
  }
}
