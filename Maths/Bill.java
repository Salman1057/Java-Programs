import java.util.Scanner;

public class Bill {
	/*
	 * This program asks user to enter the number of used electricity units and then
	 * calculates the amount of bill according to the billing slab.
	 */
	public static void main(String[] arg) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of Units to calcualte the bill: ");
		int units = input.nextInt();

		double billAmount = 0, taxOnBill;
		final double taxRate = 0.17;

		int firstUnitRange = 100 * 10;
		int secUnitRange = 200 * 13;
		int thirdUnitRange = 200 * 15;
		int fourthUnitRange = 500 * 18;

		if (units > 0) {
			if (units > 0 || units <= 100) {
				billAmount = units * 10;
			} else if (units <= 300) {
				billAmount = firstUnitRange + ((units - 100) * 13);
			} else if (units <= 500) {
				billAmount = firstUnitRange + secUnitRange + ((units - 300) * 15);
			} else if (units <= 1000) {
				billAmount = firstUnitRange + secUnitRange + thirdUnitRange + ((units - 500) * 18);
			} else if (units >= 1000) {
				billAmount = firstUnitRange + secUnitRange + thirdUnitRange + fourthUnitRange + ((units - 1000) * 20);
			}
		} else {
			System.out.println("ERROR: Units cannot be negative. Please enter correct numbers of Units.");
		}
		if (billAmount > 0) {
			System.out.println("Amount of bill before tax: " + billAmount);
			taxOnBill = billAmount * taxRate;
			billAmount = billAmount + taxOnBill;
			System.out.println("Total Amount of Bill (Including Taxes): " + billAmount);
		}
		input.close();
	}

}
