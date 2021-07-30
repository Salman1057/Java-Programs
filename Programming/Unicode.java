import java.util.Scanner;
public class Unicode{
/*
Java Program to assist the unicode conversions.

*/
	public static void main(String[] args){
//Char Data Type to Unicode Conversion
		Scanner inputFromUser = new Scanner(System.in);
		System.out.println("\n");
		System.out.println("Enter the Chracter to Convert into Unicode = " );
		
		char forget = inputFromUser.next().charAt(0);
		System.out.println( "______________________________________________________________\n"+"\n\nAlphabetic Chracter you just entered =" + forget);
		int converted = (int)forget;
		System.out.println("Unicode of the entered Alphabet = " + converted);
			System.out.println("\n\n---------------------------------------------");
			System.out.println("---------------------------------------------\n\n");




//Unicode to Char Data Type

		Scanner inputFromUser1 = new Scanner(System.in);
		System.out.println("Enter the Unicode to convert into Char Data Type = ");
		
		int forget1 = inputFromUser1.nextInt();
		System.out.println("\n\nNumber you just entered = " + forget1);
		char converted1= (char)forget1;
		System.out.println("Char DataType of the Entered Number = " + converted1);
 

	}

}
