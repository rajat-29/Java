class Complex
{
	private int real,imag;

	void read(int real,int imag)
	{
		this.real = real;
		this.imag = imag;
	}

	void add(Complex c1,Complex c2)
	{
		real = c1.real + c2.real;
		imag = c1.imag + c2.imag;
	}

	void display()
	{
		System.out.println(real + "i" + imag);
	}
}

class add2complexNumbers
{
	public static void main(String args[])
	{
		Complex c1 = new Complex();
		Complex c2 = new Complex();
		Complex c3 = new Complex();

		c1.read(5,4);
		c2.read(7,4);

		c3.add(c1,c2);
		c3.display();
	}
}