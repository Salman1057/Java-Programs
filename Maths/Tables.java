import java.util.Scanner;
public class Tables{
	public static void main(String[] args){
	boolean start = true;
	
		while(start){
		Scanner num = new Scanner(System.in);
		System.out.print("Enter the number to find its multiplications upto 10 : ");
		int tabNum = num.nextInt();
		int tabMul = 1;	
			while(tabMul<=10){
			
				int result = tabNum*tabMul;		
				System.out.println(tabNum + " x " + tabMul + " = " + result );
					tabMul++;
			
			}
			System.out.print("Would you like to run the Program again? [Y,n]");
				Scanner input = new Scanner(System.in);
				String suggest = input.nextLine();

				if("n".equals(suggest)){
					start = false;
					System.out.println("Thanks for using our Program.");					
				}
				
		}


	}



}
