import java.util.Scanner;

public class Opg8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfStudents;
        int studentNextScore;
        int studentLargestScore = 0;
        String studentLargestName = "";
        String studentNextName;
        System.out.println("Enter the number of students");
        numberOfStudents = input.nextInt();
        System.out.println("You can enter information on "+numberOfStudents+" students");
        for (int i = 0; i<numberOfStudents; i++){
            System.out.println("Enter the score and name of a student");
            studentNextScore = input.nextInt();
            studentNextName = input.next();
            if (studentNextScore >= studentLargestScore) {
                studentLargestScore = studentNextScore;
                studentLargestName = studentNextName;
            }
        }
        System.out.println("The student with the highest score was "+studentLargestName+" with a score of "+studentLargestScore);
    }
}
