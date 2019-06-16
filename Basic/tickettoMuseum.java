public class tickettoMuseum {

  public static void main(String[] args) {

    int age = 50,price = 10;
    boolean isStudent = false;

    if(age <=15 || age >= 60 || isStudent)
    {
      price = 5;
    }
    
    else
    {
      price = 10;
    }

    System.out.println("Ticket Fare is = " +price);
  }

}
