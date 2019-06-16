public class commentonPic2 {

  public static void main(String[] args) {
    int currentLikes = 10;
    String comment = "Hi";
    boolean like = true;
    currentLikes =  likePhoto(currentLikes,comment,like);

    System.out.println("CurrentLikes : " +currentLikes);
  }

  public static int likePhoto(int currentLikes,String comment,boolean like)
  {
      System.out.println("Feedback : " +comment);
      if(like)
      {
        currentLikes += 1;
      }
      return currentLikes;
  }
  
}
