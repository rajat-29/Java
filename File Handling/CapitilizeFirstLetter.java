static void capitalizeWords(String source, String dest)
{
  try
  {
    BufferedWriter out = new BufferedWriter(new FileWriter(dest));
    BufferedReader in = new BufferedReader(new FileReader(source));
    String s = in.readLine();

    while(s != null)
    {
     char ch[] = s.toCharArray();
     // System.out.println(ch);
      for(int i=0;i<s.length();i++)
      {
        if(i == 0 && ch[i] != ' ' || ch[i] != ' ' && ch[i-1] == ' ')
        {
         if(ch[i] >= 'a' && ch[i]<='z')
         {
           ch[i] = (char)(ch[i] - 'a' + 'A');
         }
        }
      }
      System.out.println(ch);
      out.write(ch);
      s = in.readLine();
    }
    in.close();
  }
  catch(Exception e)
  {
    System.out.println("Hello");
  }
}
