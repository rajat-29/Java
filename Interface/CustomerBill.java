import java.uti.Scanner;

class Customer
{
	private int id,discount;
	private String name;

	public Customer(int id,String name,int discount)
	{
		this.id = id;
		this.name = name;
		this.discount = discount;
	}

	public int getId()
	{
		return id;
	}

	public String getName()
	{
		return name;
	}

	public int getDiscount()
	{
		return discount;
	}

	public void netDiscount(int disc)
	{
		discount = disc;
	}

	public String toString()
	{
		String s = (name);
		s = s.concat("(");
		s = s.concat(Integer.toString(id));
		s = s.concat(")");
		return s;
	}
}

class Bill
{
	private Customer raj;
	private int id;
	private double amount;

  public Bill(int ID,Customer cust,double amount)
  {
    this.ID=ID;
    raj=cust;
    this.amount=amount;
  }
  public int getID()
  {
    return ID;
  }
  public Customer getCustomer()
  {
    return raj;
  }
  public void setCustomer(Customer c1)
  {
    raj=c1;
  }
  public double getAmount()
  {
    return amount;
  }
  public void setAmount(double amt)
  {
    amount=amt;
  }
  public int getCustomerID()
  {
    return raj.getID();
  }
  public String getCustomerName()
  {
    return raj.getName();
  }
  public int getCustomerDiscount()
  {
    return raj.getDiscount();
  }
  public double getFinalAmt()
  {
    double n = raj.getDiscount();
    double f = ((amount*n)/100);
    amount-=f;
    return amount;
  } 

}

class CustomerBill
{
	public static void main(String[] args) 
	{
		
	}
}