public class multipleParameter {

  public static void main(String[] args) {
    int height = 120,width = 25, incolor = 1;
    printPhoto(height,width,incolor);
  }

  public static void printPhoto(int h,int w,int incolor)
  {
    System.out.println("Height " + h + "cm");
    System.out.println("Width " + w + "cm");
    if(incolor == 1)
    {
      System.out.println("Print is colored");
    }
    else
    {
      System.out.println("Print is black and white");
    }
  }
}
