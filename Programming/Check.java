import java.util.Scanner;

public class Check {
    /*
            This Program takes a binary from the user and then prints its 1's compliments and 2's compliment. 
                    #  1's compliment is the invert of the entered binary.
                            e.g enteredBinary = 101010 , 1's compliment is = 010101 
                    #  2's compliment is made by adding a binary of 1 to 1's compliment
                            2's compliment of 101010 is -------->  010101 -----> + 1 =====>  010110
                                                                    ||             ||           ||
                                                              1's compliment       Adding 1     2's compliment          

    */                  
    
    public static void main(String[] args) {                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                
        Scanner read = new Scanner(System.in);
        System.out.print("\nEnter a number:   ");
        int a = read.nextInt();             // Input taken from user is stored in the form of String

        System.out.println("\'" + a);
        


        read.close();
    }
}
