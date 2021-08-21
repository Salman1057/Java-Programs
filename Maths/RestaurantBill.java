import java.util.Scanner;
public class RestaurantBill {
	/*
	 * This Program takes charges and then calcualte the 6.75% tax on it and also
	 * the tip which is 20% of the total charge (Including Taxes).
	 * 
	 */
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.print("Enter the Charges:  ");
		int mealCharge = read.nextInt();
		double tax = mealCharge * 6.75 / 100;
		double totalCharge = mealCharge + tax;
		double tip = totalCharge * 20 / 100;

		System.out.println("Meal Charge = " + mealCharge);
		System.out.println("Tax on the Meal = " + tax);
		System.out.println("Total Charge = " + totalCharge);
		System.out.println("Tip on Meal = " + tip);
		read.close(); // Closing the Input

	}

}