static void appendFiles(String f1, String f2, String f3)
{
  try
  {
    BufferedWriter out = new BufferedWriter(new FileWriter(f3));
    BufferedReader in = new BufferedReader(new FileReader(f1));
    String inLine = in.readLine();
    while(inLine!=null)
    {
      System.out.println(inLine);
      out.write(inLine);
      inLine = in.readLine();
    }
    in.close();
    in = new BufferedReader(new FileReader(f2));
    inLine = in.readLine();
    while(inLine!=null)
    {
      System.out.println(inLine);
      out.write(inLine);
      inLine = in.readLine();
    }
    in.close();
  }
  catch(Exception e){
    System.out.println("hello");
  }
}
