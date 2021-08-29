import java.util.Scanner;

public class SumOfDigitsBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter the Starting Point :    ");
        int numFirst = read.nextInt();
        System.out.print("Enter the Ending Point :    ");
        int numSec = read.nextInt(), sum = 0;
        System.out.println("\n\t\t *** Starting and Ending Numbers are Inclusive ***");

        System.out.print("Sum of the Digits betweeen Number " + numFirst + " and Number " + numSec + " is ");
        while (numFirst != numSec || numSec != numFirst) {
            if (numFirst <= numSec) {
                sum += numFirst;
                numFirst++;
            } else if (numFirst >= numSec) {
                sum += numFirst;
                numFirst--;
            }
        }
        if (numFirst <= numSec) {
            sum += numFirst;

        } else if (numFirst >= numSec) {
            sum += numFirst;

        }
        System.out.println(sum + " .");

        read.close();
    }
}
