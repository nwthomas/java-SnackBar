package snackbar;

public class Customer
{
	// FIELDS
	private static int maxId = 0;
	private int id;
	private String name;
	private double cash;

	// CONSTRUCTOR
	public Customer (String name, double cash)
	{
		maxId++;
		id = maxId;
		this.name = name;
		this.cash = cash;
	}

	// METHODS
	//====================================== GET AND SET ID
	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	//====================================== GET AND SET NAME
	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	//====================================== GET AND SET CASH 
	public double getCash()
	{
		return cash;
	}

	public void setCash(double cash)
	{
		this.cash += cash;
	}

	//====================================== MAKE PURCHASE
	public void makePurchase(double cashUsed)
	{
		this.cash -= cashUsed; 
	}

	//====================================== DISPLAY CUSTOMER
	@Override
	public String toString()
	{
		String rtnStr = "id: " + id + "\n" +
						"name: " + name + "\n" +
						"cash: " + cash + "\n";
		return rtnStr;
	}
}