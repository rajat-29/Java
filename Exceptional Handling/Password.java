import java.util.Scanner;

class Myexception extends Exception
{
	char error;
	Myexception(char error)
    {
    	this.error = error;
    }
    public void display()
    {
    	if(error == 's')
        {
      	  System.out.println("Too short!");
        }
        else if(error == 'd')
        {
        	System.out.println("No digit!");
        }
    }
    
    public String toString()
    {
    	return "password";
    }
}
class Password
{
  public static void checkPass(String s) throws Myexception
  {
    boolean check = false;
    for(int i=0;i<s.length();i++)
    {
      if(Character.isDigit(s.charAt(i)))
      {
        check = true;
      }
    }
    if(check == false)
    {
      throw new Myexception('d');
    }
    if(s.length()<6)
    {
      throw new Myexception('s');
    }
  }
  
  public static void main(String[] args)
  {
    Scanner obj = new Scanner(System.in);
    String s1,s2;
    s1 = obj.nextLine();
    s2 = obj.nextLine();
    try
    {
      checkPass(s2);
      System.out.println("Correct");
    }
    catch(Myexception e)
    {
      e.display();
    }
  }
}