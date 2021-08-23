import java.util.Scanner;

public class BinaryCalculator {
    /*
     * This Program add and subtract two binary numbers and also give their 1's and
     * 2's compliments.
     */
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        System.out.print("\nEnter the First Binary:    ");
        String num = read.nextLine();
        System.out.print("Enter the Second Binary:    ");
        String num1 = read.nextLine();
        boolean check = true;
        while (check) {
            int binary1 = Integer.parseInt(num, 2);
            int binary2 = Integer.parseInt(num1, 2);
            int sum = binary1 + binary2;
            int subt = binary1 - binary2;
            String binarySum = Integer.toBinaryString(sum);
            String binarySubt = Integer.toBinaryString(subt);

            System.out.println("\n\t\t\t\tDecimal of the Binary " + num + " is : " + binary1);
            System.out.println("\t\t\t\tDecimal of the Binary " + num1 + " is : " + binary2 + "\n");
            System.out.println("Sum of the Decimal Numbers is : " + (binary1 + binary2));
            System.out.println("Difference of the Decimal Numbers is : " + (binary1 - binary2));
            System.out.println("\n\t\t\t\tSum of the Binary : " + binarySum);
            System.out.println("\t\t\t\tSubtraction of the Binaries : " + binarySubt + "\n");

            check = false;

        }

        read.close();
    }
}
