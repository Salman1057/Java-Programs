import java.util.Scanner;

public class TaxCalculationOnTheBasisOfMarriageStatus {
	/*
		This Program outputs the payable tax based on the following criteria:
*
*                Status              Earning Range   Tax Percentage      Amount Over     

*                Single                 0-8,000              10%                $0
*                                     8,000-32,000      $800 + 15%          $8,000
*                                      >=32,000         $4,400 + 25%        $32,000

*                Married               0-16,000              10%               $0
*                                    16,000-64,000       $1,600 + 15%        $16,000
*                                     >=64,000           8,800 + 25%         $64,000
	*/
		 

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Please enter 's' for single and 'm' for married. ");
		String status = input.nextLine();
		double taxAmount;

		int singlesBaseMoneyRange_2 = 800;
		int singlesBaseMoneyRange_3 = 4400;
		int marriedBaseMoneyRange_2 = 1600;
		int marriedBaseMoneyRange_3 = 8800;

		final double singlesTax = 0.10;
		final double singlesTax_1 = 0.15;
		final double singlesTax_2 = 0.25;
		final double marriedTax = 0.10;
		final double marriedTax_1 = 0.15;
		final double marriedTax_2 = 0.25;

		if ("s".equals(status)) {
			System.out.print("Enter your Income:");
			int incomeInput = input.nextInt();

			if (incomeInput > 0 && incomeInput <= 8000) {
				taxAmount = incomeInput * singlesTax;
			} else if (incomeInput >= 8000 && incomeInput <= 32000) {
				taxAmount = ((incomeInput - 8000) * singlesTax_1) + singlesBaseMoneyRange_2;
			} else {
				taxAmount = ((incomeInput - 32000) * singlesTax_2) + singlesBaseMoneyRange_3;
			}

			System.out.println("Tax on your Income is: $" + taxAmount);

		} else {
			System.out.print("Enter your Income: ");
			int marriedIncomeInput = input.nextInt();

			if (marriedIncomeInput > 0 && marriedIncomeInput <= 16000) {
				taxAmount = marriedIncomeInput * marriedTax;
			} else if (marriedIncomeInput >= 16000 && marriedIncomeInput <= 64000) {
				taxAmount = ((marriedIncomeInput - 16000) * marriedTax_1) + marriedBaseMoneyRange_2;
			} else {
				taxAmount = ((marriedIncomeInput - 64000) * marriedTax_2) + marriedBaseMoneyRange_3;
			}

			System.out.println("Tax on your Income is: $" + taxAmount);
		}

		input.close();

	}

}
