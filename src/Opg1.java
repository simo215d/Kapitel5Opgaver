import java.util.Scanner;

public class Opg1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int score = 0;
        while (score != -1){
            System.out.println("Enter your score: ");
            score = input.nextInt();
            if (score >= 60){
                System.out.println("You passed!");
            } else if(score < 60 && score != -1) {
                System.out.println("You failed.");
            } else if (score == -1){
                System.out.println("No numbers are entered except 0");
                break;
            }
            System.out.println();
        }
    }
}
