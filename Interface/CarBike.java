interface Vehicle
{
	void changeGear(int a);
	void speedUp(int a);
	void applyBrakes(int a);
}

class Car implements Vehicle
{
	public int gear,speed;

	public void changeGear(int a)
	{
		gear = a;
	}
	public void speedUp(int a)
	{
		speed+=a;
	}
	public void applyBrakes(int a)
	{
		speed-=a;
	}
	public String toString()
  	{
  		return ""+speed+"kmph";
  	}
}

class Bike implements Vehicle
{
	public int gear,speed;

	public void changeGear(int a)
	{
		gear = a;
	}
	public void speedUp(int a)
	{
		speed+=a;
	}
	public void applyBrakes(int a)
	{
		speed-=a;
	}
	public String toString()
  	{
  		return ""+speed+"kmph";
  	}
}

class CarBike
{
	public static void main(String[] args) 
	{
		Car c1 = new Car();
		c1.changeGear(1);
		c1.speedUp(50);
		c1.speedUp(30);
		c1.applyBrakes(20);

		Bike b1 = new Bike();
		b1.changeGear(1);
		b1.speedUp(50);
		b1.speedUp(30);
		b1.applyBrakes(20);

		System.out.println("" + c1.toString());
		System.out.println("" + b1.toString());
	}
}