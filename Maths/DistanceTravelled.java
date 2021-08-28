import java.util.Scanner;
public class DistanceTravelled{

	public static void main(String[] args){
		Scanner read = new Scanner(System.in);
		System.out.print("Enter number of hours you've been travelling for:   ");	
		int hrs = read.nextInt() ;
		System.out.print("Enter the average speed of the vehicle in MPH:   ");		
		int speed = read.nextInt(), distance , i = 1;
		System.out.println("\n\t------------------------------------\n\tHours\t\t Distance Travelled\n\t------------------------------------");
		
		while( i <= hrs ){
			distance = i * speed;
			System.out.println("\t"+i+"\t\t\t"+distance);
			i++;
		}
		read.close();
	}

}
