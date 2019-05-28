package snackbar;

public class Main 
{

  private static void workWithData() 
  {
  	// New customers
  	Customer c1 = new Customer("Jane", 45.25);
  	Customer c2 = new Customer("Bob", 33.14);

  	// New vending machines
  	VendingMachine vFood = new VendingMachine("Food");
  	VendingMachine vDrink = new VendingMachine("Drink");
  	VendingMachine vOffice = new VendingMachine("Office");

  	// New snacks
  	Snack sChips = new Snack("Chips", 36, 1.75, vFood.getId());
  	Snack sChocolateBar = new Snack("Chocolate Bar", 36, 1.00, vFood.getId());
  	Snack sPretzel = new Snack("Pretzel", 30, 2.00, vFood.getId());
  	Snack sSoda = new Snack("Soda", 24, 2.50, vDrink.getId());
  	Snack sWater = new Snack("Water", 20, 2.75, vDrink.getId());

  	System.out.println(c1.toString());
  	System.out.println(c2.toString());

  }

  public static void main(String[] args) 
  {
    workWithData();
  }
}