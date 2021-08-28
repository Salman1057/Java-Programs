import java.util.Scanner;

public class Practice {
    /*
     * This program has 4 parts: 1- Program will keep asking for a number unitl you
     * enter a negative number then it prints the sum of the entered numbers 
     * 2-Program will be asking for Strings and then it prints them for confirmation purposes
     * 3- Enter a number to print its factorials
     * 4-Enter a base number first and then the power number.
     * 
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("\n************* Question # 1 ************* ");
        int sum = 0;
        double i = 1, factorials = 1, j = 1, powerResult = 1;
        boolean check = true;
        while (check) {
            System.out.println("Enter a number to add them : / 'Enter a negative number to quit' ");
            int sumNum = read.nextInt();
            if (sumNum > 0) {
                sum += sumNum;
                i++;
            } else {
                System.out.println("Sum of the entered numbers is: " + sum);
                break;
            }
        } // 1st while - Question Ended.

        System.out.println("\n************* Question # 2 ************* ");
        while (check) {
            System.out.println("Enter your name: / 'Type End to quit' ");
            String name = read.nextLine();
            if ("END".equals(name) || "end".equals(name) || "End".equals(name)) {
                break;
            } else {
                System.out.println("You have entered the name : " + name);
            }
        } // 2nd while -- Question Ended.

        System.out.println("\n************* Question # 3 ************* ");
        System.out.print("Enter a number to find its factorials : ");
        int num = read.nextInt();
        System.out.print("Factorials of the number " + num + " are ");
        while (i <= num) {
            factorials *= i;
            i++;
            System.out.print("  " + factorials + " ");
        } // 3rd while ended
        System.out.println("\n\n\t\tFactorial of the number " + num + " is " + factorials + " .");
        System.out.println("\n************* Question # 4 ************* ");
        System.out.print("Enter the base number : ");
        int num1 = read.nextInt();
        System.out.print("Enter the power number: ");
        int powerNum = read.nextInt();
        while (j <= powerNum) {
            powerResult *= num1;
            j++;
        }
        System.out.println("Answer of the base number " + num1 + " to the power of " + powerNum + " is " + powerResult);

        read.close();
    }// Main

}// Class
