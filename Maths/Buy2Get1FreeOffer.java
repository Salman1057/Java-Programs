import java.util.Scanner;

public class Buy2Get1FreeOffer {

	public static void main(String[] args) {

		// Number of Pizzas
		Scanner read = new Scanner(System.in);
		System.out.print("Enter the number of Pizzas =    ");
		int valueOfPizzas = read.nextInt();
		System.out.println("Number of Pizzas = " + valueOfPizzas);

		// Number of Free Pizzas (Buy 2 Get 1 Free offer)
		int numOfFreePizzas = valueOfPizzas / 2;
		System.out.println("Number of Free Pizzas = " + numOfFreePizzas);

		// Total Number of Pizzas

		int totalPizzas = numOfFreePizzas + valueOfPizzas;
		System.out.println("Total Number of Pizzas = " + totalPizzas);
		// Price Section

		double priceOfPizza = valueOfPizzas * 20;
		int priceOfSinglePizza = 20;
		System.out.println("Your Grand Total is $" + priceOfPizza);
		System.out.println("--------------------------");

		// Calculation
		System.out.print("Calculation:\n ");
		System.out.println("\t\tNumber of Pizzas x Price of Pizza");
		System.out.print("\t\t\t= " + valueOfPizzas);
		System.out.println("x" + priceOfSinglePizza);
		double calculation = valueOfPizzas * priceOfSinglePizza;
		System.out.println("\t\t\t= $" + calculation);

		read.close();
	}

}