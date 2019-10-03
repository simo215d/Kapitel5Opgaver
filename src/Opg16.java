import java.util.Scanner;

public class Opg16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer and i will show the smallest factors in an increasing order owo");
        int number = input.nextInt();
        int factor = 2;
        //JEG FORSTÅR IKKE DENNE OPGAVE :D
        while(factor <= number){
            if (number%factor == 0){
                System.out.println(factor);
                number /= factor;
            } else {
                factor++;
            }
        }
    }
}
