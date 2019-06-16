public class commentonPic {

  public static void main(String[] args) {
    int currentLikes = 10;
    String comment = "Hi";
    boolean like = true;
     likePhoto(currentLikes,comment,like);
  }

  public static void likePhoto(int currentLikes,String comment,boolean like)
  {
      System.out.println("Feedback : " +comment);
      if(like)
      {
        currentLikes += 1;
      }
      System.out.println("CurrentLikes : " +currentLikes);
  }

}
