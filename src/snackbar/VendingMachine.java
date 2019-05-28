package snackbar;

public class Customer
{
	// FIELDS
	private static int maxId = 0;
	private int id;
	private String name;

	// CONSTRUCTOR
	public Customer(String name)
	{
		maxId++;
		id = maxId;
		this.name = name;
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
}