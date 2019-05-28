package snackbar;

public class VendingMachine
{
	// FIELDS
	private static int maxId = 0;
	private int id;
	private String name;

	// CONSTRUCTOR
	public VendingMachine (String name)
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