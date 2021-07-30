import java.lang.Math;
import java.util.Scanner;
public class BinaryCalc{
/*

Java Program to convert:
 (1) Binary to Decimal			(4) Decimal to Binary		(7) Decimal to Octal 		(10) Decimal to Hexa
 (2) Octal to Decimal			(5) Octal to Binary		(8) Binary to Octal 		(11) Binary to Hexa
 (3) Hexa to Decimal			(6) Hexa to Binary		(9) Hexa to Octal		(12) Octal to Hexa

*/
	public static void main(String[] args){
		boolean start = true;
		while(start){
		
			System.out.println("\n\t\t\t\t\t Welcome to Binary Calculator\n\n Author: Muhammad Salman\t\t\t\t v1.1");
			System.out.println("\n\t\t\t(1) Type 'btd' to convert BINARY TO DECIMAL, 'dtb' to convert DECIMAL TO BINARY. ");
			System.out.println("\n\t\t\t(2) Type 'bto' to convert BINARY TO OCTAL, 'otb' to convert OCTAL TO BINARY. ");
			System.out.println("\n\t\t\t(3) Type 'bth' to convert BINARY TO HEXA, 'htb' to convert HEXA TO BINARY.");
			System.out.println("\n\t\t\t(4) Type 'htd' to convert HEXA TO DECIMAL, 'dth' to convert DECIMAL TO HEXA.");
			System.out.println("\n\t\t\t(5) Type 'hto' to convert HEXA TO OCTAL, 'oth' to convert OCTAL TO HEXA.");
			System.out.println("\n\t\t\t(6) Type 'otd' to convert OCTAL TO DECIMAL, 'dto' to convert DECIMAL TO OCTAL.");
			
				Scanner input = new Scanner(System.in);
				System.out.print("Enter desired option: ");
				String inputType = input.nextLine();
				
					if("btd".equals(inputType)){						//1-a Binary to Decimal
						Scanner inputBTD = new Scanner(System.in);
						System.out.print("Enter the Binary number to convert into Decimal: ");
						String inputValue = inputBTD.nextLine();
						int outBTD = Integer.parseInt(inputValue, 2);
						
						System.out.println("Decimal of the Binary " + inputValue + " is " + outBTD+".");
							
						}	
						
					
					if("dtb".equals(inputType)){						//1-b Decimal to Binary
						Scanner inputDTB = new Scanner(System.in);
						System.out.print("Enter the Decimal to convert into Binary: ");
						int DTB = inputDTB.nextInt();
						
						System.out.println("Binary of the Decimal " + DTB + " is " + Integer.toBinaryString(DTB)+".");
					
					}		
			
					if("bto".equals(inputType)){						//2-a Binary to Octal Conversion
						Scanner inputBTO = new Scanner(System.in);
						System.out.print("Enter the Binary to convert into Octal: ");
						String inputValue = inputBTO.nextLine();
						int BTO = Integer.parseInt(inputValue, 2);
						
						
						System.out.println("Octal of the binary " + inputValue +" is " + Integer.toOctalString(BTO)+".");
					 
					}
					
					
					if("otb".equals(inputType)){						//2-b Octal to Binary Conversion
						Scanner inputOTB= new Scanner(System.in);
						System.out.print("Enter the Octal to convert into Binary: ");
						String inputValue = inputOTB.nextLine();
						int OTB = Integer.parseInt(inputValue, 8);
						
						System.out.println("Binary of the Octal " + inputValue + " is " + Integer.toBinaryString(OTB)+".");
					
					}
					
					if("bth".equals(inputType)){						//3-a Binary to Hexa Conversion
						Scanner inputBTH = new Scanner(System.in);
						System.out.print("Enter the Binary to convert into Hexadecimal: ");
						String inputValue = inputBTH.nextLine();
						int BTH = Integer.parseInt(inputValue, 2);
						
						System.out.println("Hexadecimal of the binary " + inputValue +" is " + Integer.toHexString(BTH)+".");
					 
					}		

					if("htb".equals(inputType)){						//3-b Hexa to Binary Conversion
						Scanner inputHTB = new Scanner(System.in);
						System.out.print("Enter the Hexadecimal to convert into Binary: ");
						String inputValue = inputHTB.nextLine();
						int HTB = Integer.parseInt(inputValue, 16);
						
						System.out.println("Binary of the Hexadecimal " + inputValue +" is " + Integer.toBinaryString(HTB)+".");
					 
					}
					
					if("htd".equals(inputType)){						//4-a Hexa to Decimal Conversion
						Scanner inputHTD = new Scanner(System.in);
						System.out.print("Enter the Hexadecimal to convert into Decimal: ");
						String inputValue = inputHTD.nextLine();
						int HTD = Integer.parseInt(inputValue, 16);
						
						System.out.println("Decimal of the Hexadecimal " +inputValue+" is " + HTD+".");
					 
					}
					
					if("dth".equals(inputType)){						//4-b Decimal to Hexa Conversion
						Scanner inputDTH = new Scanner(System.in);
						System.out.print("Enter the Decimal to convert into Hexadecimal: ");
						String inputValue = inputDTH.nextLine();
						int DTH = Integer.parseInt(inputValue, 10);
						
						System.out.println("Hexadecimal of the Decimal " + inputValue +" is " + Integer.toHexString(DTH)+".");
					 
					}

					if("hto".equals(inputType)){						//5-a Hexadecimal to Octal Conversion
						Scanner inputHTO = new Scanner(System.in);
						System.out.print("Enter the Hexadecimal to convert into Octal: ");
						String inputValue = inputHTO.nextLine();
						int HTO = Integer.parseInt(inputValue, 16);
						
						System.out.println("Octal of the Hexadecimal " + inputValue +" is " + Integer.toOctalString(HTO)+".");
					 
					}
						
					if("oth".equals(inputType)){						//5-b Octal to Hexadecimal Conversion
						Scanner inputOTH = new Scanner(System.in);
						System.out.print("Enter the Octal to convert into Hexadecimal: ");
						String inputValue = inputOTH.nextLine();
						int OTH = Integer.parseInt(inputValue, 8);
						
						System.out.println("Hexadecimal of the Octal " + inputValue +" is " + Integer.toHexString(OTH)+".");
					 
					}
			
					if("otd".equals(inputType)){						//6-a Octal to Decimal Conversion
						Scanner inputOTD = new Scanner(System.in);
						System.out.print("Enter the Octal to convert into Decimal: ");
						String inputValue = inputOTD.nextLine();
						int OTD = Integer.parseInt(inputValue, 8);
						
						System.out.println("Decimal of the Octal " +inputValue+ " is " + OTD+".");
					 
					}
					
					if("dto".equals(inputType)){						//6-b Decimal to Octal Conversion
						Scanner inputDTO = new Scanner(System.in);
						System.out.print("Enter the Decimal to convert into Octal: ");
						String inputValue = inputDTO.nextLine();
						int DTO = Integer.parseInt(inputValue, 10);
						
						System.out.println("Octal of the Decimal " + inputValue +" is " + Integer.toOctalString(DTO)+".");
					 
					}

				System.out.print("Would you like to run the program again? [Y/n]");
				Scanner console = new Scanner(System.in);
				String exit = console.nextLine();
				if("n".equals(exit)){
					System.out.println("Thanks for using our Program. Would like to hear your suggestions. Reach me @ [<user-name>@<domain.com>]");
					start = false;
				
				}
		
			 }
	}


}
