import java.util.Scanner;

public class SecondDigitProgram {
    /*
     * This program takes two numbers from user and then takes first two digits of
     * the first number and then takes last two digits of the second number and then
     * adds them to show the user.
     */
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Number:   ");
        int number = scan.nextInt();
        System.out.print("Enter the Second Number:   ");
        int number1 = scan.nextInt();

        int lastTwoDigit = 0;
        /*
         * Below is the way to calculate the Sum of the First Two Digits of the Number
         */

        int totalDigits = (int) Math.log10(number);
        totalDigits -= 1; // -1 to seprate the 1st two digits
        int firstTwoDigits = (int) (number / (int) Math.pow(10, totalDigits));

        /*
         * Below is the way to calculate the sum of the Last two Digits of a Number
         */
        lastTwoDigit += (number1 % 100); // remainder with 10 will give the last digit and with 100 would give last two
                                         // digits
        System.out.println("Sum of the First and Last Digits is : " + (firstTwoDigits + lastTwoDigit));

        scan.close();
    }
}
