public class coffemaker {

  public static void main(String[] args) {

    int passcode = 629;
    String coffe;

    switch (passcode) {

      case 555:
      {
        coffe = "Espresso";
        break;
      }

      case 312:
      {
        coffe = "Vanilla Latte";
        break;
      }

      case 629:
      {
        coffe = "Drip Coffee";
        break;
      }

      default:
      {
        coffe = "Unknown";
        break;
      }
    }

    System.out.println(coffe);

  }
}
