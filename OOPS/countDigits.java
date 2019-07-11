import java.util.Scanner;

class cal
{
	private int digit,count=0;

	void count(int digit)
	{
		this.digit = digit;
		while(digit!=0)
		{
			count++;
			digit = digit/10;
		}
	}

	void display()
	{
		System.out.print("Total Digits are = " + count);
	}
}

class countDigits
{
	public static void main(String[] args) 
	{
		cal c1 = new cal();

		Scanner obj = new Scanner(System.in);

		int digit = obj.nextInt();

		c1.count(digit);
		c1.display();
	}
}