package snackbar;

public class Snack
{
	// FIELDS
	private static int maxId = 0;
	private int id;
	private String name;
	private int quantity; // Possibly double later
	private double cost; // Possibly double later
	private int vendingMachineId; // Possibly double later

	// CONSTRUCTOR
	public Snack (String name, int quantity, double cost, int vendingMachineId)
	{
		maxId++;
		id = maxId;
		this.name = name;
		this.quantity = quantity;
		this.cost = cost;
		this.vendingMachineId = vendingMachineId;
	}

	// FIELDS
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

	//====================================== GET AND SET QUANTITY
	public int getQuantity()
	{
		return quantity;
	}

	public void setQuantity(int quantity)
	{
		this.quantity = quantity;
	}

	//====================================== GET AND SET COST
	public double getCost()
	{
		return cost;
	}

	public void setCost(double cost)
	{
		this.cost = cost;
	}

	//====================================== GET AND SET VENDING MACHINE ID
	public int getVendingMachineId()
	{
		return vendingMachineId;
	}

	public void setVendingMachineId(int vendingMachineId)
	{
		this.vendingMachineId = vendingMachineId;
	}

	//====================================== ADD QUANTITY
	public void addQuantity(int additionalQuantity)
	{
		this.quantity += additionalQuantity;
	}

	//====================================== BUY SNACK FROM GIVEN QUANTITY
	public void buySnack(int boughtQuantity)
	{
		this.quantity -= boughtQuantity;
	}

	//====================================== GET TOTAL COST GIVEN A QUANTITY
	public double getTotalCost(int quantity)
	{
		return cost * quantity;
	}
}