package RandomOpgave;

import java.net.SecureCacheResponse;
import java.util.Scanner;

public class GuessNumber2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 10");
        int uNumber = input.nextInt();
        int x = 0;
        while (x != uNumber){
            x++;
        }
        System.out.println("Computer guessed it! Number was: "+uNumber);
    }
}
