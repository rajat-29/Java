class Person
{
	String name;
	String color;
	int eye;
	int year;
}

class Actor extends Person
{
	Actor(String name,String color,int eye,int year)
	{
		this.name = name;
		this.color = color;
		this.eye = eye;
		this.year = year;
	}

	public void printString()
	{
		System.out.println("The person " + name + " is an Actor. He is " + color + " in color, has " + eye + " eyes and debut in " + year);
	}
}

class Actress extends Person
{
	Actress(String name,String color,int eye,int year)
	{
		this.name = name;
		this.color = color;
		this.eye = eye;
		this.year = year;
	}

	public void printString()
	{
		System.out.println("The person " + name + " is an Actress. He is " + color + " in color, has " + eye + " eyes and debut in " + year);
	}
}

class Actors
{
	public static void main(String[] args) 
	{
		Actor a1 = new Actor("Amitabh","BROWN",2,1965);
		Actress a2 = new Actress("Hema","WHITE",2,1975);
		a1.printString();
		a2.printString();

	}
}