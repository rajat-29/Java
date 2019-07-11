import java.util.Scanner;

class calculate
{
	private int p,rate,time;
	float result;

	void init(int p, int rate,int time)
	{
		this.p = p;
		this.rate = rate;
		this.time = time;
	}

	void cal()
	{
		result = (float)(p*(Math.pow((1.0+rate/100.0),time)));
	}

	void display()
	{
		//result = Math.round((result * 10) / 10.0);
		System.out.println("Compound Interest is = " + result);
	}

}

class compundInterest
{
    public static void main(String[] args) 
	{

		calculate c1 = new calculate();
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter Principal");
		int p = obj.nextInt();
		System.out.println("Enter Rate");
		int rate = obj.nextInt();
		System.out.println("Enter Time");
		int time = obj.nextInt();

		c1.init(p,rate,time);
		c1.cal();
		c1.display();


		
	}
}