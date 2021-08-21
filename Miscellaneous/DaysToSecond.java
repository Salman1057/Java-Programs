import java.util.Scanner;

public class DaysToSecond {
    /*
     * This Program converts entered Number of Days into numbers of Seconds.
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter the number of days:   ");
        int numOfDays = read.nextInt();

        int numOfSecIn1Day = 60 * 60 * 24;
        int numOfSecs = numOfDays * numOfSecIn1Day;
        System.out.println("Number of Seconds in " + numOfDays + " days are: " + numOfSecs);
        read.close();
    }
}
