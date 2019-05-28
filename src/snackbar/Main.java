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

  	// Processing via README instructions
  	System.out.println("1. Customer 1 buys 3 of snack 4. Print Customer 1 Cash on hand. Print quantity of snack 4.");
  	double purchase1 = 3 * sSoda.getCost();
  	c1.makePurchase(purchase1);
  	sSoda.buySnack(3);
  	System.out.println("Customer 1 cash: " + c1.getCash());
  	System.out.println("Snack 4 quantity: " + sSoda.getQuantity());
  	System.out.println();

  	System.out.println("2. Customer 1 buys 1 of snack 3. Print Customer 1 Cash on hand. Print quantity of snack 3.");
  	double purchase2 = 1 * sPretzel.getCost();
  	c1.makePurchase(purchase2);
  	sPretzel.buySnack(1);
  	System.out.println("Customer 1 cash: " + c1.getCash());
  	System.out.println("Snack 3 quantity: " + sPretzel.getQuantity());
  	System.out.println();

  	System.out.println("3. Customer 2 buys 2 of snack 4. Print Customer 2 Cash on Hand. Print quantity of snack 4.");
  	double purchase3 = 2 * sSoda.getCost();
  	c2.makePurchase(purchase3);
  	sSoda.buySnack(2);
  	System.out.println("Customer 2 cash: " + c2.getCash());
  	System.out.println("Snack 4 quantity: " + sSoda.getQuantity());
  	System.out.println();

  	System.out.println("4. Customer 1 finds $10. Print Customer 1 Cash on Hand.");
  	c1.setCash(10.00);
  	System.out.println(c1.getCash());
  	System.out.println();

  	System.out.println("5. Customer 1 buys 1 of snack 2. Print Customer 1 Cash on Hand. Print quantity of snack 2.");
  	double purchase4 = 1 * sChocolateBar.getCost();
  	c1.setCash(purchase4);
  	sChocolateBar.buySnack(1);
  	System.out.println("Customer 1 cash: " + c1.getCash());
  	System.out.println("Snack 2 quantity: " + sChocolateBar.getQuantity());
  	System.out.println();

  	System.out.println("6. Add 12 more items to snack 3. Print quantity of snack 3.");
  	sPretzel.setQuantity(10);
  	System.out.println(sPretzel.getQuantity());
  	System.out.println();

  	System.out.println("7. Customer 2 buys 3 of snack 3. Print Customer 2 Cash on hand. Print quantity of snack 3.");
  	double purchase5 = 3 * sPretzel.getCost();
  	c2.makePurchase(purchase5);
  	sPretzel.buySnack(3);
  	System.out.println("Customer 2 cash: " + c2.getCash());
  	System.out.println("Snack 3 quantity: " + sPretzel.getQuantity());
  	System.out.println();
  }

  public static void main(String[] args) 
  {
    workWithData();
  }
}