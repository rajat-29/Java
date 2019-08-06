import java.util.Scanner;

class Myexception extends Exception
{
  int error;
  Myexception(int error)
  {
    this.error = error;
  }
  public void display()
  {
    if(error == 1)
    {
      System.out.println("Valid");
    }
    else
    {
      System.out.println("Invalid");
    }
  }
}

class ValidEmail
{
  public static void checkPass(String s1) throws Myexception
  {
    int l = s1.length();
      for(int i=0;i<l;i++)
      {
        if(s1.charAt(i)== '@')
        {
          
          for(int j=i;j<l;j++)
          {
            if(s1.charAt(j) == '.')
            {
              
              throw new Myexception(1);
            }
          }
          throw new Myexception(2);
        }
        else if(s1.charAt(i) == '.')
        {
          for(int j=i;j<l;j++)
          {
            if(s1.charAt(j) == '@')
            {
              throw new Myexception(2);
            }
          }
          throw new Myexception(2);
        }
      }
  }
  
  public static void main(String[] args)
  {
    String id;
    Scanner s1=new Scanner(System.in);
    id=s1.nextLine();
    try
    {
      checkPass(id);
      System.out.println("Valid");
    }
    catch(Myexception e)
    {
      e.display();
    }
  }
  
}

