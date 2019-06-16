public class temperature {

  public static void main(String[] args) {
    int temperature = 45;
    weatherTemperature(temperature);
  }

  public static void weatherTemperature(int temp)
  {
    if(temp > 30) {
      System.out.println("It's hot outside");
    }

    else if(temp < 5) {
      System.out.println("It's cold outside");
    }

    else {
      System.out.println("Not to cold, Not to hot");
    }
  }

}
