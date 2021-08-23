import java.util.*;

public class ReverseNum  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        String num = sc.nextLine();

        int i;
        String numRev = "";
        for (i = (num.length() - 1); i >= 0; i--) {
            numRev = numRev + String.valueOf(num.charAt(i));
        }
        System.out.println("Reverse number is : " + numRev);
    }

}