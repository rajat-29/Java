import java.util.Scanner;

class Rect
{
	private int x,y,heigth,width;

	Rect(int x,int y,int heigth,int width)
	{
		this.x = x;
		this.y = y;
		this.heigth = heigth;
		this.width = width;
	}

	public int getX()
	{
		return x;
	}

	public int getY()
	{
		return y;
	}

	public int getHeight()
	{
		return heigth;
	}

	public int getWidth()
	{
		return width;
	}

	public String display()
	{
		return "Rectangle[x="+x+",y="+y+",width="+width+",height="+heigth+"]";
	}




}

class Rectangle
{
	public static void main(String[] args) 
	{
		int x,y,heigth,width;
	
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter x = ");
		x = obj.nextInt();
		System.out.println("Enter Y = ");
		y = obj.nextInt();
		System.out.println("Enter Height = ");
		heigth = obj.nextInt();
		System.out.println("Enter Width = ");
		width = obj.nextInt();

		Rect r1 = new Rect(x,y,heigth,width);

		System.out.println(r1.getX());
		System.out.println(r1.getY());
		System.out.println(r1.getHeight());
		System.out.println(r1.getWidth());
		System.out.println(r1.display());


		
	}
}