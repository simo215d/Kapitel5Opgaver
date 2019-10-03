public class Opg3 {
    public static void main(String[] args) {
        System.out.println("Celsius  Fahrenheit");
        double x = 0;
        while (x <= 100){
            double f = x*9/5+32;
            System.out.println(x+"      "+f);
            x += 2;
        }
    }
}
