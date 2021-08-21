import java.util.Scanner;

public class TwistedPrime {
	/*
	 * This Program checks for Twisted Prime ( A twisted prime is a prime numbes
	 * whose reverse is also a Prime Number. e.g 11 is prime and also twisted
	 * prime.) First it checks the number for the prime number and then it reverses
	 * the number and then again checks for the prime numbers , if it is prime then
	 * it prints that entered number is twisted prime.
	 */
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		System.out.print("Enter the Number:   ");
		int Num = read.nextInt();
		int reverseNum = 0, numIncrement = 2, reverseNumIncrement = 2;
		boolean resultNum = true, resultReverseNum = true;
		int sqrtNum = (int) Math.sqrt(Num);

		while (numIncrement <= sqrtNum) { // Section to check for the Prime Number
			if (Num % numIncrement == 0) {
				resultNum = false;
			}
			numIncrement++;
		}
		System.out.println("\nIs the Number " + Num + " Prime?? \n\t\t" + resultNum);

		while (Num != 0) { /// Section to Reverse the Entered Number
			int remainder = Num % 10;
			reverseNum = reverseNum * 10 + remainder;
			Num /= 10;
		}

		int sqrtReverseNum = (int) Math.sqrt(reverseNum);
		while (reverseNumIncrement <= sqrtReverseNum) { // Section to check the reverse number for Twisted Prime
			if (reverseNum % reverseNumIncrement == 0) {
				resultReverseNum = false;
			}
			reverseNumIncrement++;
		}

		System.out.println("\n\tThe reverse of the given number is: " + reverseNum + "\n");
		System.out.println("Is the Number " + reverseNum + " Prime?? \n\t\t" + resultReverseNum);
		read.close();

		if (resultNum == true && resultReverseNum == true) {		// Section for the Decision of the Twisted Prime
			System.out.println("Number " + Num + " is Twisted Prime");
		} else {
			System.out.println("Number " + Num + " is not Twisted Prime.");
		}

	}

}
