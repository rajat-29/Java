public class searchWifi {

  public static void main(String[] args) {
    wifi();
  }

  public static void wifi()
  {
    for(int i=0;i<10;i++)
    {
      boolean wifiAvail = checkavail();
      if(wifiAvail)
      {
        System.out.println("Wifi Found");
        break;
      }
    }
  }

  public static boolean checkavail()
  {
    return true;
  }

}
