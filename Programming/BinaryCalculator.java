import java.util.Scanner;

public class BinaryCalculator {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        System.out.print("Enter the First Binary:    ");
        String num = read.nextLine();
        System.out.print("Enter the Second Binary:    ");
        String num1 = read.nextLine();
        boolean check = true;
        while (check) {
            int binary1 = Integer.parseInt(num, 2);
            int binary2 = Integer.parseInt(num1, 2);
            int sum = binary1 + binary2;
            String binarySum = Integer.toBinaryString(sum);

            System.out.println(binarySum);
            check = false;

        }
        
        read.close();
    }
}
