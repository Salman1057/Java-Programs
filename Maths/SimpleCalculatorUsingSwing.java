import javax.swing.JOptionPane;

public class SimpleCalculatorUsingSwing {
        /**
         * This Program uses the swing class of java and also takes input from user
         * using swing and then shows the user output in swing - GUI .
         */
        public static void main(String[] args) {
                System.out.println("\n\t\t (1) Press + for addition.");
                System.out.println("\n\t\t (2) Press - for subtraction.");
                System.out.println("\n\t\t (3) Press / for division.");
                System.out.println("\n\t\t (4) Press % for remainder.");
                System.out.println("\n\t\t (5) Enter s for square root.");
                System.out.println("\n\t\t (6) Enter p for power. \n\n");

                int num1 = 0, num2 = 0, result = 0;
                double resultDouble = 0, numDouble1 = 0, numDouble2 = 0;
                String choice1 = "+";

                String choice = JOptionPane.showInputDialog("Enter the desired operation symbol.");
                while (choice.charAt(0) != '+'&& choice.charAt(0) != '-' &&choice.charAt(0) != '*'&&choice.charAt(0) != '/'&&choice.charAt(0) != '%'
                && choice.charAt(0) != 's'&& choice.charAt(0) != 'p') {
                                choice = JOptionPane.showInputDialog("Enter the correct option to find desired results.");
                }
                
               if (choice.charAt(0) == 's') {
                        numDouble1 = Double.parseDouble(
                        JOptionPane.showInputDialog(null, "Enter the number to find its square root."));
                        resultDouble = Math.sqrt(numDouble1);
                } else if (choice.charAt(0) == 'p') {
                        numDouble1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the base number."));
                        numDouble2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the power number."));
                        resultDouble = Math.pow(numDouble1, numDouble2);
                }
                else if (choice.charAt(0) != 's' && choice.charAt(0) != 'p') {
                        num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the first number."));
                        num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the second number."));

                        if (choice.charAt(0) == '+') {
                                result = num1 + num2;
                        } else if (choice.charAt(0) == '-') {
                                result = num1 - num2;
                        } else if (choice.charAt(0) == '*') {
                                result = num1 * num2;
                        } else if (choice.charAt(0) == '/') {
                                result = num1 / num2;
                        } else if (choice.charAt(0) == '%') {
                                result = num1 % num2;
                        }

                }

                if (choice.charAt(0) == '+' || choice.charAt(0) == '-' || choice.charAt(0) == '*'
                                || choice.charAt(0) == '/' || choice.charAt(0) == '%') {
                        if (choice.charAt(0) == '+') {
                                choice1 = "sum";
                        }
                        if (choice.charAt(0) == '-') {
                                choice1 = "subtraction";
                        }
                        if (choice.charAt(0) == '*') {
                                choice1 = "multiplication";
                        }
                        if (choice.charAt(0) == '/') {
                                choice1 = "division";
                        }
                        if (choice.charAt(0) == '%') {
                                choice1 = "remainder";
                        }
                        JOptionPane.showMessageDialog(null, "The " + choice1 + " of the number " + num1 + " and number "  + num2 + " is " + result + ".");
                        System.out.println("\n\tResult:  The " + choice1 + " of the number " + num1 + " and number " + num2 + " is " + result + ".\n");
                                  
                } else if (choice.charAt(0) == 's' || choice.charAt(0) == 'p') {
                        if (choice.charAt(0) == 's') {
                                JOptionPane.showMessageDialog(null, "The square root of the number " + numDouble1  + " is " + resultDouble + ".");
                                System.out.println("\n\tResult:  The square root of the number " + numDouble1 + " is "+ resultDouble + ".\n");
                                                
                        } else {
                                JOptionPane.showMessageDialog(null, "The power of the base number " + numDouble1 + " to the power " + numDouble2 + " is " + resultDouble + ".");
                                System.out.println("\n\tResult:  The power of the base number " + numDouble1  + " to the power " + numDouble2 + " is " + resultDouble + ".\n");
                                              
                        }

                }

                System.exit(0);
        }

}
