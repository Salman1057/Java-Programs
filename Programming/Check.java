import java.util.Scanner;

public class Check {
    /*
            This Program takes a binary from the user and then prints its 1's compliments and 2's compliment. 
                    #  1's compliment is the invert of the entered binary.
                            e.g enteredBinary = 101010 , 1's compliment is = 010101 
                    #  2's compliment is made by adding a binary of 1 to 1's compliment
                            2's compliment of 101010 is -------->  010101 -----> + 1 =====>  010110
                                                                    ||             ||           ||
                                                              1's compliment       Adding 1     2's compliment          

    */                  
    
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("\nEnter a number:   ");
        String a = read.nextLine();             // Input taken from user is stored in the form of String
        
        int binary = Integer.parseInt(a,2);     // User-Input is being converted into int datatype
        int b = ~binary;                           // 1's compliment using unary bitwise compliment operator
        System.out.println("\n\t\t\tDecimal of the Binary Number is  :  " + binary ); // Entered binary converted to Decimal
        String result = Integer.toBinaryString(b);      // 1's Compliment is convevrted into binary 
        System.out.println("1's compliment of " + a + " is [ " + result +" ] \n"); //Printing 1's compliment
        //long z = 11111111111111111111111111111010l;
        //System.out.println("Length is :  " + z.length());

        long resultInIntDataType = Long.parseLong(result,2);      // Converting 1's compliment into int data type to add 1 to make 2's compliment
        String c = "1";                               // Declaring 1 as String  
        long binary2 = Long.parseLong(c,2);            // Converting 1 to Binary
        System.out.println(binary2);                // Printing the Binary of the 1 
        long  sum = resultInIntDataType + binary2;                   // Adding the Binaries of 1's compliment and 1 to make 2's compliment
        String sec = String.valueOf(sum);           // Converting the int sum into String
        long result3 = Long.parseLong(sec,2);      // Converting the String to Int
        String result1 = Long.toBinaryString(result3);    // Converting the sum of int data type to Binary
        System.out.println("2's compliment of " + a + " is " + result1);         // Printing the 2's compliment

        read.close();
    }
}
