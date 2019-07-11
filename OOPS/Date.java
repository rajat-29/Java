import java.util.Scanner;

class DateCal
{
	private int day,month;
	DateCal(int day,int month)
	{
		this.day = day;
		this.month = month;
	}

	public int daysInMonth()
	{
		if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12)
			return 31;
		else if(month == 2)
			return 28;
		else
			return 30;
	}

	public int getDay()
	{
		return day;
	}
	public int getMonth()
	{
		return month;
	}
	public int nextDay()
	{
		day++;
		if(month==12 && day>31)
		{
			day=-31;
			month-=11;
		}
		return day;
	}
	public String getString()
	{
		return "" + month + "/" + day + "";
	}
	public int absoluteDay()
	{
		int a[] = {31,28,31,30,31,30,31,31,30,31,30,31};
		int sum=0;
		for(int i=0;i<month-1;i++)
			sum += a[i];
		return sum+day;
	}

}

class Date
{
	public static void main(String[] args) 
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter day = ");
		int day = obj.nextInt();
		System.out.println("Enter month = ");
		int month = obj.nextInt();

		DateCal c1 = new DateCal(day,month);

		System.out.println("Days in Month = " + c1.daysInMonth());
		System.out.println("Days = " + c1.getDay());
		System.out.println("Month = " + c1.getMonth());
		System.out.println("Next Day = " + c1.nextDay());
		System.out.println("String = = " + c1.getString());
		System.out.println("Absolute Day = " + c1.absoluteDay());
	}
}