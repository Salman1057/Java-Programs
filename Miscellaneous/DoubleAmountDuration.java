import java.util.Scanner;

public class DoubleAmountDuration {
	/*
	 * This program will take an amount as an input and then calculate the number of
	 * years to double that amount at an interest rate stored in taxRate variable.
	 * 
	 */
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.print("Enter the inital deposit:   ");
		double initialAmount = read.nextInt(), in = initialAmount, doubleInitialAmount = 2 * initialAmount,
				taxRate = 0.05;
		int yrs = 0;
		long interestMoney = 1;
		System.out.println("\t Years \t\t Deposits");

		while (initialAmount <= doubleInitialAmount) {

			interestMoney = Math.round(initialAmount * taxRate);
			initialAmount += interestMoney;
			yrs++;
			System.out.println("\t " + yrs + "\t\t " + initialAmount + " with an increase of " + interestMoney);
		}
		System.out.println("\n\tIt will take " + yrs + " years to double your Initial Deposit of " + in
				+ " at an interest rate of 5%.");
				read.close();
	}

}
