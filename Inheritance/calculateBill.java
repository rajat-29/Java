import java.util.Scanner;

class Bill
{
	int price,qty,two,five,hund,fifty,ten,sum,finalamt;
}

class CashBill extends Bill
{
	void get_Cash()
	{
		Scanner obj = new Scanner(System.in);
		System.out.print("ENTER AMOUNT");
		price = obj.nextInt();
		System.out.print("ENTER QTY");
		qty = obj.nextInt();
		System.out.print("ENTER TWO THOUSAND NOTES");
		two = obj.nextInt();
		System.out.print("ENTER FIVE HUNDERED NOTES");
		five = obj.nextInt();
		System.out.print("ENTER HUNDERED NOTES");
		hund = obj.nextInt();
		System.out.print("ENTER FIFTY NOTES");
		fifty = obj.nextInt();
		System.out.print("ENTER TEN NOTES");
		ten = obj.nextInt();
	}

	void display()
	{
		finalamt = (qty*price);
		sum = ((two*2000)+(five*500)+(hund*100)
			+(fifty*50)+(ten*10));
		if(sum<finalamt)
		{
			finalamt-=sum;
			System.out.println("Need to Pay: " +finalamt);
		}
		else
		{
			System.out.println("Clear");
		}
	}
	
}

class calculateBill
{
	public static void main(String[] args) 
	{
		CashBill c1 = new CashBill();
		c1.get_Cash();
		c1.display();
	}
}