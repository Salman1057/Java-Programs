import java.util.*;

public class TempratureUnitConversions {
    /*
     * This program asks the user to enter a temparture in particular units of
     * temprature and then it converts it back to the other unit.
     *  e.g, 
     *      tempInCentigrade = 0 , then the program would print the tempInFahrenheit = 32    
     * 
     */

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("\n\n\t\t\tType ctf to convert Celsius Temprature in to Fahrenheit ");
        System.out.println("\t\t\tType ftc to convert Fahrenheit Temprature in to Celsius \n");
        System.out.print("Enter the Desired Option :    ");
        String decision = read.nextLine();
        double centigrade = 0, fahrenheit = 0;
        if ("ctf".equals(decision)) {
            System.out.print("Enter the temprature in Celsius to convert into Fahrenheit:   ");
            double tempInCentigrade = read.nextDouble();
            fahrenheit = (tempInCentigrade * 9 / 5) + 32;
            System.out.println("Temprature " + tempInCentigrade + " in Centigrades is " + fahrenheit + " in Fahrenheit.");
        } else if ("ftc".equals(decision)) {
            System.out.print("Enter the temprature in Fahrenheit to convert into Celsius:   ");
            double tempInFahrenheit = read.nextDouble();
            centigrade = (tempInFahrenheit - 32) * 5 / 9;
            System.out.println("Temprature " + tempInFahrenheit + " in Fahrenheit is " + centigrade + " in Centigrade.");
        } else {
            System.out.println("Enter the correct option. !!!");
        }

        read.close();
    }

}