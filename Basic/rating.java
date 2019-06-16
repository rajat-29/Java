public class rating {

  public static void main(String[] args) {

    int rating = 4;

    if(rating >= 0 && rating <= 5)
    {
      if(rating < 2)
      {
        System.out.println("What's the reason for your low rating");
      }
      else
      {
        System.out.println("Than you for your Feedback");
      }
    }
    else
    {
        System.out.println("Invalid Ratings");
    }
  }

}
