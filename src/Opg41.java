import java.util.Scanner;

public class Opg41 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 5 numbers, last must be 0");
        int[]arr = new int[5];
        arr[0] = input.nextInt();
        arr[1] = input.nextInt();
        arr[2] = input.nextInt();
        arr[3] = input.nextInt();
        arr[4] = input.nextInt();
        int max = arr[0];
        int count = 1;
        for (int x = 1; x<arr.length; x++){
            if (arr[x]<max)
                continue;
            else if (arr[x]==max) {
                count++;
                continue;
            }
            else if (arr[x]>max){
                max = arr[x];
                count = 1;
            }
        }
        System.out.println("The greatest number is: "+max+" which occurred "+count+" times.");
    }
}
