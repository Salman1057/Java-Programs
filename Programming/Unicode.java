import java.util.Scanner;

public class Unicode {
	/*
	 * 				Java Program to assist the unicode conversions.
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 														
 
		System.out.print("\nEnter the Chracter to Convert into Unicode =    ");							// Char Data Type to Unicode Conversion
		char enteredChar = input.next().charAt(0);
		int convertedUnicode = (int) enteredChar;
		System.out.println("Unicode of the Character " + enteredChar + " is = " + convertedUnicode );

		System.out.println("\n---------------------------------------------\n");

		System.out.print("Enter the Unicode to convert into Char Data Type =    "); 						// Unicode to Char Data Type
		int enteredUnicode = input.nextInt();
		char convertedChar = (char) enteredUnicode;
		System.out.println("Char of the Unicode " + enteredUnicode + " is = " + convertedChar +"\n" );
		input.close();

	}

}
