import java.util.Scanner;

public class Tables {
	/*
	 * This Program takes Input from the user and then prints its multiplications
	 * upto 10. You can increase its multiplication upto whatever yu want. Just change the value in the while condition .
	 */
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);

		System.out.print("Enter the number to find its multiplications upto 10 : ");
		int tabNum = num.nextInt();
		int tabMul = 1;
		while (tabMul <= 20) {			// Controlling the loop

			int result = tabNum * tabMul;
			System.out.println(tabNum + " x " + tabMul + " = " + result);
			tabMul++;

		}
		num.close();
	}

}
