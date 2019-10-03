import java.security.interfaces.RSAMultiPrimePrivateCrtKey;
import java.util.Scanner;

public class Opg18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Pattern A");
        for (int i = 1; i <= 6; i++) {
            for (int x = 1; x <= i; x++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Pattern B");
        for (int i = 6; i >= 1; i--) {
            for (int x = 1; x<=i;x++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Pattern C");
        for (int i = 1; i <= 6; i++) {
            for (int space = 1; space <= 6-i; space++){
                System.out.print(" ");
            }
            for (int star = 1; star <= i; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Pattern D");
        for (int i = 6; i >= 1; i--){
            for (int space = 1; space <= 6-i; space++){
                System.out.print(" ");
            }
            for (int star = 1; star <= i;star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
