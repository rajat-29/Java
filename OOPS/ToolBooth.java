import java.util.Scanner;

class ToolBoothCal
{
	private int count=0,car=0;
	public void payingCar()
	{
		count+=50;
		car+=1;
	}
	public void nonpayingCar()
	{
		car+=1;
	}
	public void display()
	{
		System.out.println("Total Cash : " +count +"/-");
  		System.out.print("Total Cars : " +car);
	}

}

class ToolBooth
{
	public static void main(String[] args) 
	{
		ToolBoothCal c1 = new ToolBoothCal();
		Scanner obj = new Scanner(System.in);
		char temp = obj.next().charAt(0);
		while(temp!='q')
		{
			if(temp == 'p')
			{
				c1.payingCar();
			}
			else if(temp == 'n')
			{
				c1.nonpayingCar();
			}
			temp = obj.next().charAt(0);
		}
		if(temp == 'q')
		{
			c1.display();
		}
		
	}
}