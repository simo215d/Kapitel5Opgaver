public class Opg10 {
    public static void main(String[] args) {
        String result = "";
        int number = 0;
        for (int i = 100; i <= 1000; i++){
            if (i%3==0 || i%4==0){
                number += 1;
                result += i+" ";
                if (number == 10){
                    System.out.println(result);
                    number = 0;
                    result = "";
                }
            }
        }
    }
}
