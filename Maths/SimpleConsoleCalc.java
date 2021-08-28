import java.util.Scanner;

public class SimpleConsoleCalc {

    public static void main(String[] args) {
        System.out.println(
                "\n\n\n----------------****Simple Calculator*****-------------\n\n v1.1 \t Author: Muhammad Salman");
        boolean start = true;

        while (start) {

            System.out.println("\n\tWelcome to Simple Calculator"); // Welcome Section
            System.out.println("\t\t\t (1) To add, type 'a', to subtract, type 's'.");
            System.out.println("\t\t\t (2) To multiply, type 'm', to divide, type 'd'.");
            // Taking user input
            Scanner input1 = new Scanner(System.in);
            String action = input1.nextLine();

            if ("a".equals(action)) { // ******* Addition Section ********//

                System.out.print("Enter the First Number: "); // First Input
                int num1 = input1.nextInt();

                System.out.print("Enter the Second Number: "); // Second Input
                int num2 = input1.nextInt();

                int sum = num1 + num2;
                System.out.println("Sum of " + num1 + " and " + num2 + " is " + sum);

            }

            if ("s".equals(action)) { // ******* Subtraction Section ********//

                System.out.print("Enter the First Number: "); // First Input
                int num1 = input1.nextInt();

                System.out.print("Enter the Second Number: "); // Second Input
                int num2 = input1.nextInt();

                int subtraction = num1 - num2;
                System.out.println("Subtraction of " + num1 + " and " + num2 + " is " + subtraction);

            }

            if ("m".equals(action)) { // ******* Multilpication Section ********//

                System.out.print("Enter the First Number: "); // First Input
                int num1 = input1.nextInt();

                System.out.print("Enter the Second Number: "); // Second Input
                int num2 = input1.nextInt();

                int multiplication = num1 * num2;
                System.out.println("Result of multiplication of " + num1 + " and " + num2 + " is " + multiplication);

            }

            if ("d".equals(action)) { // ******* Division Section ********//

                System.out.print("Enter the First Number: "); // First Input
                int num1 = input1.nextInt();

                System.out.print("Enter the Second Number: "); // Second Input
                int num2 = input1.nextInt();

                int division = num1 / num2;
                System.out.println("Result of division of " + num1 + " and " + num2 + " is " + division);

            }

            System.out.print("\t\t\tWould you like to start the program again? [Y,n] ");
            Scanner input2 = new Scanner(System.in);
            String action1 = input2.nextLine();

            if ("n".equals(action1)) {

                start = false;
                System.out.println("\t\t\t\tBye. Have a Good Day");
            }

            input1.close();
            input2.close();
        }

    }

}
