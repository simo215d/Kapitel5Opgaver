package RandomOpgave;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rNumber = (int)(Math.random()*10+1);
        System.out.println("The number is between 1 and 10. Guess the number:");
        int uNumber = input.nextInt();
        while (uNumber != rNumber){
            if (uNumber<rNumber)
                System.out.println("Wrong! guess higher.");
            if (uNumber>rNumber)
                System.out.println("Wrong! guess lower.");
            uNumber = input.nextInt();
        }
        System.out.println("You guessed it! The number is: "+rNumber);
    }
}
