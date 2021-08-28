import java.util.Scanner;

public class LetterGradesConversionToNumbers {
    /*
     * This Program asks the user to enter their grades in letters and then prints
     * their gpa according to following Scheme.
     *          A+ = 4 ,   A = 4 , A- = 3.7
     *          B+ = 3.3 , B = 3 , B- = 2.7
     *          C+ = 2.3 , C = 2 , C- = 1.7
     *          D+ = 1.3 , D = 1 , D- = 0.7;
     *          F = 0
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter your Grades:");
        String inputChar = read.nextLine();

        double grade;

        if (inputChar.charAt(0) == 'a' || inputChar.charAt(0) == 'A') {
            grade = 4.0;
            if ((inputChar.length() == 2) && inputChar.charAt(1) == '-') {
                grade -= 0.3;
            }
            System.out.println("Your Numeric Grades are " + grade);
        } else if (inputChar.charAt(0) == 'b' || inputChar.charAt(0) == 'B') {
            grade = 3.0;
            if ((inputChar.length() == 2) && inputChar.charAt(1) == '+') {
                grade += 0.3;
            } else if ((inputChar.length() == 2) && inputChar.charAt(1) == '-') {
                grade -= 0.3;
            }
            System.out.println("Your Numeric Grades are " + grade);
        } else if (inputChar.charAt(0) == 'c' || inputChar.charAt(0) == 'C') {
            grade = 2.0;
            if ((inputChar.length() == 2) && inputChar.charAt(1) == '+') {
                grade += 0.3;
            } else if ((inputChar.length() == 2) && inputChar.charAt(1) == '-') {
                grade -= 0.3;
            }
            System.out.println("Your Numeric Grades are " + grade);
        } else if (inputChar.charAt(0) == 'd' || inputChar.charAt(0) == 'D') {
            grade = 1.0;
            if ((inputChar.length() == 2) && inputChar.charAt(1) == '+') {
                grade += 0.3;
            } else if ((inputChar.length() == 2) && inputChar.charAt(1) == '-') {
                grade -= 0.3;
            }
            System.out.println("Your Numeric Grades are " + grade);
        } else if (inputChar.charAt(0) == 'f' || inputChar.charAt(0) == 'F') {
            grade = 0.0;
            if ((inputChar.length() == 2) && (inputChar.charAt(1) == '+' || inputChar.charAt(1) == '-')) {
                System.out.println("ERROR: 'F' Grade can't have '+' or '-' values. Please correct this.");
            } else {
                System.out.println("Your Numeric Grades are " + grade);
            }
        } else {
            System.out.println("ERROR: Please enter the correct Grades");
        }
        read.close();
    }
}
