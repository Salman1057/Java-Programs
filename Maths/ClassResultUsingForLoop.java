import java.util.Scanner;

public class ClassResultUsingForLoop {
    /*
     * This program asks the user to enter the number of students, number of quizes
     * taken and then marks and print out the Sum of Obtd. Marks and the percantage
     * of individual students. It also prints the average marks of the class and
     * average percantage of the class.
     * 
     * 
     * Note: At this time, program is accepting the input numbers from Math.random()
     * and if you really wants to take numbers from user then do some tweaks on 
     * Line 33.
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("\nEnter the Number of Students:   ");
        int numOfStuds = read.nextInt();
        System.out.print("Enter the Number of Quizes :   ");
        int numOfQuizes = read.nextInt(), sumOfObtdMarks = 0, avgOfObtdMarksOfStuds = 0;
        System.out.print("Enter the Total Marks of Quiz : ");
        int marksOfQuizes = read.nextInt();
        int j;
        int avgOfPercAllStud = 0, sumOfAllStud = 0, avgObtdMarksOfAll = 0;
        double totalMarks = (numOfQuizes * marksOfQuizes);

        for (int i = 1; i <= numOfStuds; i++) {
            System.out.println("\n\t\t\t ***** Enter the Marks for Student " + i + " ***** \n");
            sumOfObtdMarks = 0;
            avgOfObtdMarksOfStuds = 0;
            for (j = 1; j <= numOfQuizes; j++) {

                int marksOfQuiz = 10 + (int) (Math.random() * marksOfQuizes);
                System.out.print("Enter the Marks for Quiz " + j + " : " + marksOfQuiz + "\n");
                while (marksOfQuiz < 0 || marksOfQuiz > marksOfQuizes) {
                    System.out.println("\n\t\tERROR: Marks should be in the Range of  0-" + marksOfQuizes);
                    System.out.println("\t\tEnter the Marks for Quiz " + j + " :   ");
                    marksOfQuiz = 0 + (int) (Math.random() * marksOfQuizes);
                }
                sumOfObtdMarks += marksOfQuiz;
                avgOfObtdMarksOfStuds = sumOfObtdMarks / j;
                avgObtdMarksOfAll += avgOfObtdMarksOfStuds;
            }
            System.out.println("\n\t\t\t\tSum of Obtd. Marks by Students " + i + " is :  " + sumOfObtdMarks);
            sumOfAllStud += sumOfObtdMarks;
            System.out.println("\t\t\t\tAverage Obtd. Marks of Student " + i + "  is :  " + avgOfObtdMarksOfStuds);
            double Percentage = Math.round(sumOfObtdMarks / totalMarks * 100);
            avgOfPercAllStud += Percentage;
            System.out.println("\t\t\t\t Percentage of Student " + i + "  is :  " + Percentage + "% .");
        }
        System.out.println("\n\n\t\t\t\t******* CLASS RESULT REPORT *******\n");
        System.out.println("Sum of obtd. Marks by All Students is : " + sumOfAllStud);
        System.out.println("Total Marks of All Students are : " + (numOfStuds * (marksOfQuizes * numOfQuizes)));
        System.out.println("Average Obtd. Marks out of " + (totalMarks) + " is : " + avgObtdMarksOfAll / numOfStuds);
        System.out.println("Average Percentage of the class is : " + (avgOfPercAllStud / numOfStuds) + "% .");

        read.close();
    }
}
