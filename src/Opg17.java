import java.util.Scanner;

public class Opg17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number between 1 and 15");
        int number = input.nextInt();
        int i = number;
        String result = "";
        //The first loop is responsible for each individual line. There are as many lines as the number is large.
        for (int x = i; x > 0; x--){
            //The second loop know how many numbers each line is made of, using x.
            for (int y = 0; y < (x*2-1); y++){
                //Y is also used to note where we are. So Y=0 is first number and Y=X-1 is half way. If we are in first half:
                if (y < x) {
                    result += x - y;
                }
                //if we are in the second half: (+2 because (7-7=0, 8-7=1, 9-7=2) which is 2 behind what we want)
                if (y >= x){
                    result += y - x+2;
                }
            }
            System.out.println(result);
            result = "";
        }
    }
}
