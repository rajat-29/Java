static void countLines(String f1)
{
  try
  {
  	BufferedReader in = new BufferedReader(new FileReader(f1));
  	String s = in.readLine();
  	int line=0,blank=0;
    while(s!=null)
    {
      if(s.equals(""))
      {
        blank++;
      }
      line++;
      s=in.readLine();
    }
System.out.print(line + " " + blank);
  }
  catch(Exception e)
  {
    System.out.print("Hello");
  }
}




