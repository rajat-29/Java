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
    	if(error == -1)
        {
        	System.out.println("Out of Bounds");
        }
        else
        {
        	System.out.println(error);
        }
    }
}

class ValidIndex
{
  
  public static void checkPass(int [] arr,int size,int a) throws Myexception
  {
    if(a>=size)
    {
      throw new Myexception(-1);
    }
    else
    {
      throw new Myexception(arr[a]);
    }
  }
  
    public static void main(String[] args)
    {
        // Write your code here
      Scanner obj = new Scanner(System.in);
      int size,a,b,j=0;
      size = obj.nextInt();
      int arr[] = new int[size];
                          
      for(int i=0;i<size;i++)
      {
        arr[i] = obj.nextInt();
      }
      while(j<2)
      {
        a = obj.nextInt();
        try 
        {
          checkPass(arr,size,a);
        }
        catch(Myexception e)
        {
          e.display();
        }
        j++;
      }

    }
}

