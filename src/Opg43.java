import java.util.Scanner;

public class Opg43 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lowest number is 1. Enter a max number that will be that cap:");
        //You can remove "cap" an replace it by 7, this will result the simplest solution to the exercise.
        int cap = input.nextInt();
        int total = 0;
        for (int x = 1; x <= cap; x++){
            for (int y = x; y <=cap; y++){
                System.out.println(x+" "+y);
                total++;
            }
        }
        System.out.println("Total combinations: "+total);
    }
}
