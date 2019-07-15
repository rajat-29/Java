import java.util.Scanner;

class Publication
{
	public String title;
	public int price;
}

class Book extends Publication
{
	public int pages;
	public String author;

	Book(String title,int price,int pages,String author)
	{
		this.title = title;
		this.price = price;
		this.pages = pages;
		this.author = author;
	}

	public void putdata()
	{
		System.out.println("Book Title \"" +title +"\", written by \"" +author +"\" has " +pages +" pages and of " +price +" rupees.");
	}
}

class Cd extends Publication
{
	public int mins;

	Cd(String title,int price,int mins)
	{
		this.title = title;
		this.price = price;
		this.mins = mins;
	}

	public void putdata()
	{
		System.out.println("CD Title \"" +title +"\", is of "  +mins +" minutes length and of " +price +" rupees.");
	}
}

class BookCd
{
	public static void main(String[] args) 
	{
		String btitle,author,ctitle;
		int bprice,cprice,pages,mins;

		Scanner obj = new Scanner(System.in);

		// book input

		System.out.println("Enter Book Title");
		btitle = obj.nextLine();

		System.out.println("Enter Book Price");
		bprice = obj.nextInt();

		System.out.println("Enter Book Pages");
		pages = obj.nextInt();

		obj.nextLine();  

		System.out.println("Enter Book Author");
		author = obj.nextLine();

		// cd input

		System.out.println("Enter Cd Title");
		ctitle = obj.nextLine();

		System.out.println("Enter Cd Price");
		cprice = obj.nextInt();

		System.out.println("Enter Cd Mins");
		mins = obj.nextInt();

		Book b1 = new Book(btitle,bprice,pages,author);

		Cd c1 = new Cd(ctitle,cprice,mins);

		b1.putdata();
		c1.putdata();
	}
}