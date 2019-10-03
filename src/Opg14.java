import java.util.Scanner;

public class Opg14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int gcd = 1;
        int count = 1;
        int n1;
        int n2;
        System.out.println("Enter 2 positive integers");
        n1 = input.nextInt();
        n2 = input.nextInt();
        while (count <= n1 || count <= n2){
            if (n1%count==0 && n2%count==0){
                gcd = count;
            }
            count++;
        }
        System.out.println("Greates common divisor is "+gcd);
    }
}