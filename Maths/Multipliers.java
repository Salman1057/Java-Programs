import java.util.Scanner;

public class Multipliers {/*
                           * This program takes input from user(Dividend) and then print its divisibles(Quotients) and divisors
                           * and also checks for the prime number.
                           */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("\n\t\t  Enter the Number:  ");
        int result = read.nextInt();
        int tabNum = 2, tabMul = 1, tabMulCopy = 1, count = 0;
        boolean decision = true;
        System.out.print("\n\n");
        while ((((tabNum * tabMul) < result)) || decision) {
            if ((tabNum * tabMul) >= result) {
                if ((tabNum * tabMul) == result) {
                       System.out.println("Number " + tabNum + " is being checked against Number " + result + ". Following result has been found.");
                       System.out.println("\n\t\t\t" + tabNum + " x " + tabMul + " = " + result + "\n");
                        count++;
                         if (tabNum >= (result / 2)) {
                               decision = false;
                               System.out.println("\n\t\t\t\t\t !!!! PROGRAM ENDED !!!!\n\n");
                         }
                }
                tabMul = tabMulCopy;
                tabNum++;
            }
            if (tabNum * tabMul >= result && count == 0) {
                System.out.print("\t\t Number " + result + " has been checked against the numbers till "
                        + (tabNum - 1) + ". No matches were found. " + result + " is a Prime Number.\n");
            }
            if (tabNum * tabMul >= result) {
                decision = false;
                System.out.println("\n\t\t\t\t\t !!!! PROGRAM ENDED !!!!\n\n");
            }
            tabMul++;
        }
        read.close();
    }
}
