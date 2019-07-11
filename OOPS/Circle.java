import java.util.Scanner;

class CircleCal
{
	private double radius;
	CircleCal(double radius)
	{
		this.radius = (double)radius;
	}
	public double getRadius()
	{
		return radius;
	}
	public double getArea()
	{
		return Math.round(Math.PI*radius*radius*100D)/100D;
	}
	public double getCircumference()
	{
		return Math.round(2*Math.PI*radius*100D)/100D;
	}


}

class Circle
{
	public static void main(String[] args) 
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter Radius = ");
		double radius = obj.nextDouble();

		CircleCal c1 = new CircleCal(radius);
		System.out.println("Radius is = " + c1.getRadius());
		System.out.println("Area is = " + c1.getArea());
		System.out.println("Circumference is = " + c1.getCircumference());
	}
}